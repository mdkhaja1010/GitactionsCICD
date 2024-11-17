package com.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPageElements {
      @FindBy(css="[class='a-section a-spacing-none a-padding-none'] [id='submit.add-to-cart'] [id='add-to-cart-button']")
      public WebElement addtoCartbtn;
      @FindBy(css="#attach-view-cart-button-form>span#attach-sidesheet-view-cart-button")
      public WebElement addtoCart;
      @FindBy(css="[data-name='Active Cart'] [class*='product-title a-size-base-plus'] [class='a-truncate-cut']")
      public WebElement productText;
      @FindBy (css="[name*='submit.delete']")
      public WebElement deleteBtn;
      @FindBy(css="[class='a-row'] [class*='a-spacing-mini']")
      public WebElement validateCart;
}
