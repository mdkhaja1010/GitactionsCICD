package com.Pages;

import com.PageElements.CustomerServiceElements;
import com.Utilities.ReusableUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceElementsPage extends CustomerServiceElements {
    private final WebDriver webDriver;
    private ReusableUtils reusableUtils;

    public CustomerServiceElementsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        reusableUtils = new ReusableUtils(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String selectCustomerServicebtn() {
        for (int i = 0; i < mainMenuitems.size(); i++) {
            if (mainMenuitems.get(i).getText().equalsIgnoreCase("Customer Service")) {
                reusableUtils.clickElement(mainMenuitems.get(i));
                break;
            }
        }
        String helpPageText = reusableUtils.getElemText(servicesPageText);
        return helpPageText;
    }

    public void sltDigitalServices(String str) {
        String expectedtxt = "Hello. What can we help you with?";
        reusableUtils.validateTextEqual(expectedtxt, str, "Hello What can we help you with? text is not present");
        for (int i = 0; i < servicesbtn.size(); i++) {
            if (servicesbtn.get(i).getText().trim().equalsIgnoreCase("Digital Services and Device Support")) {
                reusableUtils.clickElement(servicesbtn.get(i));
                break;
            }
        }
    }

    public String digitText() {
        String digitalPageText = reusableUtils.getElemText(digitalServiceText);
        return digitalPageText;
    }
    public void validateDigitalService(String str1)
    {
       reusableUtils.validateTextEqual("Digital Services and Device Support",str1,"Digital Service text is not present");
    }
    public String sltOttplatform(){
        for(int i=0;i<ottplatforms.size();i++){
            if(ottplatforms.get(i).getText().equalsIgnoreCase("Prime Video")){
                reusableUtils.clickElement(ottplatforms.get(i));
                break;
            }
        }
        reusableUtils.switchToWindowUsingIndex(1);
        reusableUtils.waitUntilPageReadyState();
        String ottText=reusableUtils.getElemText(platformhelp);
        return ottText;
    }
    public void validateslcOtttext(String str){
        reusableUtils.validateTextEqual("Prime Video Support",str,"OTT Text is not displayed");

    }


}
