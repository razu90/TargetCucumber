Feature: Check Search Functionality With Multiples Products Search

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @SearchFunction
  Scenario Outline:User Will Search For Multiple Products
    When User click on search button
    And Type the products name "<products>"
    Then Click on Search icon
    And User validate the title contains "<title>"
    Examples:
      | products        | title                    |
      | Face Mask       | Face Mask : Target       |
      | Hand sanitizer  | Hand Sanitizer : Target  |
      | Rubbing alcohol | Rubbing Alcohol : Target |
#      | Ps5               | PlayStation 5 : Target     |
      | coffee maker    | Coffee Maker : Target    |

