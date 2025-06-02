pipeline {
    agent any

    parameters {
       choice(name: 'selectedTag', choices: ['@Smoke', '@Regression', '@BestSeller', '@ShoppingCart'], description: 'Select the tag to filter tests')
    }

    stages {
        stage('Checkout Repository') {
            steps {
                git 'https://github.com/mdkhaja1010/GitactionsCICD.git'
            }
        }

        stage('Build and Test with Maven') {
            steps {
                bat "mvn clean test -Ddataproviderthreadcount=2 -Dcucumber.filter.tags=${params.selectedTag}"
            }
        }

        stage('Archive Test Results') {
            steps {
                archiveArtifacts artifacts: 'ExtentReports/**/*.*', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'Pipeline complete.'
        }
    }
}
