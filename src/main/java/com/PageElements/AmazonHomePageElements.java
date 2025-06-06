package com.PageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class AmazonHomePageElements {
	@FindBy(css="#nav-hamburger-menu")
	public WebElement homebutton;
	@FindBy(css="[class='hmenu hmenu-visible'] a[class='hmenu-item']")
	public List<WebElement> bestsellerbtn;
	@FindBy(css="#zg_banner_text")
	public WebElement bestSellerstext;
	@FindBy(xpath="(//*[text()='Electronics'])[2]")
	public WebElement electronicsbtn;
	@FindBy(css="[id*='CardInstance'] div h1[class*='a-size-large']")
	public WebElement electronicsText;
	@FindBy(css="[class*='a-link-normal'] [class*='_cDEzb_p']")
	public List<WebElement> productslist;
	@FindBy(css="[class*='reinventPricePriceToPayMargin priceToPay'] [class='a-price-whole']")
	public WebElement beforecartprice;
//	@FindBy(css="span[class*='_cDEzb_p13n-sc-price']")
//	public List<WebElement> productPrice;
	@FindBy(css="[class*='a-size-medium-plus']")
	public WebElement addedtocartText;
	@FindBy(css="#nav-cart")
	public WebElement cartbtn;
	@FindBy(css="[class*='a-size-medium a-color']")
	public WebElement finalcartprice;
	
	
	
	
}
