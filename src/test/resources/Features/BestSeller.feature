Feature: As a tester I want to validate the  BestSeller 
  Background:
    Given Navigate to  Amazon Application
    
  @Regression @BestSeller
   Scenario: Validate the BestSeller page
    And Navigate to best seller
    And validate "Amazon Bestsellers" page is displayed
    When Click on the Electronics
    And validate the "Bestsellers in Electronics" page is displayed
    And Select any product in the electronics page
    And Click on the add to cart button
    And Click on the cart button
    #And Validate product is displayed in the cart page
    And Click on the cart page button
    Then Validate price of the product
    And Click on delete button from shopping cart page

   @Regression @BestSeller
     Scenario: Validate the Customer Service Page
      When Click on the customer service button
      And Select digital services and Device Support
      And Validate the "Digital Services and Device Support" page is displayed
      And Select any ott platform in the screen
      Then Validate the selected ott page is displayed

    