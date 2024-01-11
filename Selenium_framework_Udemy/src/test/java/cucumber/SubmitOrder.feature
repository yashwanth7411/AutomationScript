@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file

	Background:
		Given I landed on Ecommerce page
    
  @Regression
  Scenario Outline: Submitting the order
    Given Logged in with username <name> and password <pwd>
    When I add product <productName> to cart 
    And checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on Confirmation Page

    Examples: 
      | name  								| pwd 				| productName |
      | rahulshetty@gmail.com | IamKing@000 |	ZARA COAT 3	|