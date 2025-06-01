Feature: As a tester I want to validate the  Amazon Application
  Background:
    Given Navigate to  Amazon Application
    
  @Regression @ShoppingToCart
   Scenario: Validate zoom in of search product
    And Search for "samsung s24 ultra 5g mobile" from the search field
    When Click on the searched product
    And Mouse hover the mouse to the product to zoom in
    Then Validate the selected product is zoom
    
  @Regression @ShoppingToCart
   Scenario: Validate the add to cart of the product
    And Search for "samsung s24 ultra 5g mobile" from the search field
    When Click on the searched product
    And Click on the add to cart button 
    And Click on the cart button
    Then Validate "Samsung Galaxy S24 Ultra 5G AI Smartphone with Galaxy AI (Titanium Black, 12GB, 256GB Storage)," is added to shopping cart page
    And Click on delete button from shopping cart page
    And Validate "was removed from Shopping Cart." text is displayed