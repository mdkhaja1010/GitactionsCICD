package com.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerServiceElements {
    @FindBy(css="#nav-xshop-container [class*='nav-a']")
    public List<WebElement> mainMenuitems;
    @FindBy(css="[class$='extra-large ss-landing-container']")
    public WebElement servicesPageText;
    @FindBy(css="[class='a-spacing-none a-text-normal']")
    public List<WebElement> servicesbtn;
    @FindBy(css="[id*='help-top-container'] [class*='headding']")
    public WebElement digitalServiceText;
    @FindBy(css="[class='devicepickeroption']>[class='devicetitle']")
    public List<WebElement> ottplatforms;
    @FindBy(css=".bFBKLS span[id^='GUID']")
    public WebElement platformhelp;
}
