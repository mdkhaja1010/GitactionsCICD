pipeline {
    agent any

    parameters {
        choice(name: 'selectedTag',
               choices: ['@Smoke', '@Regression', '@BestSeller', '@ShoppingToCart', '@Sanity', '@E2E'],
               description: 'Select the tag to filter tests')
    }

    environment {
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'  // Use your local JDK path
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout Repository') {
            steps {
                git url: 'https://github.com/mdkhaja1010/GitactionsCICD.git', branch: 'master'
            }
        }

        stage('Build and Test with Maven') {
            steps {
                sh 'mvn clean test -Ddataproviderthreadcount=2 -Dcucumber.filter.tags=${selectedTag}'
            }
        }

        stage('Archive Test Results') {
            steps {
                archiveArtifacts artifacts: 'ExtentReports/**', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
