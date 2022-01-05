Feature: Search Multiples Products

  Scenario Outline:User Will Search For Multiple Products
    Given User Is In Home Page
    Then User click on search button
    And Type the products name "<products>"
    Then Click on Search icon
    When User click on search icon user will go to the product page and see page title "<title>"
    Examples:
      | products          | title                      |
      | Face Mask         | Face Mask : Target         |
      | Hand sanitizer    | Hand Sanitizer : Target    |
      | Rubbing alcohol   | Rubbing Alcohol : Target   |
      | Ps5               | PlayStation 5 : Target     |
      | coffee maker      | Coffee Maker : Target      |
