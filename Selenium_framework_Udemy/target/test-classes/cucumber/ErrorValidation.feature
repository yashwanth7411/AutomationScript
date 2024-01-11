
@tag
Feature: Error Validation
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I landed on ECommerce page
    When Logged in with username <name> and password <pwd>
    Then "Incorrect Email or Password" message is displayed

    Examples: 
      | name  								| pwd 				|
      | rahulshetty@gmail.com | IamKing@000 |