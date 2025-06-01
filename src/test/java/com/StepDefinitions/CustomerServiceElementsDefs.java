package com.StepDefinitions;

import com.Enums.Context;
import com.Pages.AmazonHomePage;
import com.Pages.CustomerServiceElementsPage;
import com.Utilities.DriverUtilis;
import io.cucumber.java.en.*;

import java.sql.SQLOutput;

public class CustomerServiceElementsDefs {

    CustomerServiceElementsPage csep;
    DriverUtilis driverUtilis;
    public CustomerServiceElementsDefs(DriverUtilis driverUtilis) {
        this.driverUtilis=driverUtilis;
        csep=this.driverUtilis.getBasePage().getcsepage();
    }
    @When("Click on the customer service button")
    public void click_on_the_customer_service_button() {
          csep.selectCustomerServicebtn();
          driverUtilis.getScenarioContext().setContext(Context.PAGETEXT,csep.selectCustomerServicebtn());
    }

    @And("Select digital services and Device Support")
    public void select_digital_services_and_device_support() {
        String name=driverUtilis.getScenarioContext().getContext(Context.PAGETEXT).toString();
        System.out.println("&&&&&&&&&&&&&&&&&&"+name);
        csep.sltDigitalServices(name);
        driverUtilis.getScenarioContext().setContext(Context.TEXT,csep.digitText());

    }

    @And("Validate the {string} page is displayed")
    public void validate_the_page_is_displayed(String string) {
         string=driverUtilis.getScenarioContext().getContext(Context.TEXT).toString();
         System.out.println("&&&&&&&&&&&&&&&&&"+string);
         csep.validateDigitalService(string);

    }

    @And("Select any ott platform in the screen")
    public void select_any_ott_platform_in_the_screen() {
        csep.sltOttplatform();
        driverUtilis.getScenarioContext().setContext(Context.OTTTEXT,csep.sltOttplatform());

    }

    @Then("Validate the selected ott page is displayed")
    public void validate_the_selected_ott_page_is_displayed() {
        String otttxt=driverUtilis.getScenarioContext().getContext(Context.OTTTEXT).toString();
        csep.validateslcOtttext(otttxt);

    }

}
