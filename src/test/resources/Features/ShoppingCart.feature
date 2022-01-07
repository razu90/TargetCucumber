Feature: Check Shopping Cart Functionality With Multiple Products


  Scenario Outline: User Will Add A Gift Card To The Cart
    Given User Is In Home Page
    Then User Will Search For Gift card
    And Chose The Gift Card
    Then From The Gift Card Page User Will Chose Delivery Method "<Dmethod>"
    And Value "<value>"
    Then User Will Add It To The Cart
    And Go To The Cart For Checkout
    When User Successfully Add The Item To The Cart
    Examples:
      | Dmethod   | value   |
      | 'E-MAIL'] | '$25']  |
#      | 'MAIL']   | '$100'] |
      | 'MOBILE'] | '$200'] |

