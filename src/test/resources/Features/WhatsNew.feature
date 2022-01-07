Feature: Check Functionality For What's New Page

  @CheckDealsFunction
  Scenario Outline: From The Home Page User Will Click What's New
    Given User Is In Home Page
    Then Click on What's New
    And Chose  Some Categories "<category>"
    When User is in the category page
    And Page Title "<title>"
    Examples:
      | category             | title                                                 |
      | Women's New Arrivals | New Arrivals & 2022 Fashion Trends for Women : Target |
      | Men's New Arrivals   | Men's New Arrivals : Target                           |
      | Kids' New Arrivals   | Kids' New Arrivals : Target                           |





