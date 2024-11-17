package com.TextExecutor;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Enums.Context;
import com.sun.net.httpserver.Authenticator.Retry;

import failedTestCases.Retryy;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.StepDefinitions",
        tags="@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/cucumber-json-report.json",
                "timeline:target/test-output-thread/",
                "junit:target/cucumber-reports/cucumber-junit-report.xml",
                "html:target/cucumber-reports/cucumber-pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
              
        }
        
)
public class TestRunner  extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Execution Started");
    }
 /* @Test(
    		groups= {"cucumber"},
    		description="Runs Cucumber Scenarios",
    		dataProvider="scenarios",
    		retryAnalyzer = Retryy.class
    		)
    @Override
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
    	super.runScenario(pickleWrapper, featureWrapper);
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Test Execution Started");
    }*/
    //execution command::"		"
    
    //driverUtilis.getScenarioContext().setContext(Context.PRICE, strMobile);
    //String strPrice=driverUtilis.getScenarioContext().getContext(Context.PRICE).toString();
}
