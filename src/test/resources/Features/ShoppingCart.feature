Feature: Check Shopping Cart Functionality With Multiple Products

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @ShoppingCartFunction
  Scenario Outline: User Will Add A Gift Card To The Cart
    When User Search For Gift card
    And Chose The Gift Card Design
    And Chose Delivery Method "<Dmethod>"
    And Value "<value>"
    And Add It To The Cart
    Then User will see the product successfully added to the cart
    Examples:
      | Dmethod   | value   |
      | 'E-MAIL'] | '$50']  |
      | 'MOBILE'] | '$100'] |
      | 'E-MAIL'] | '$200'] |
      | 'MOBILE'] | '$500'] |

