Feature: Here User Will Check Some Latest Products

  @CheckDealsFunction
  Scenario Outline: From The Home Page User Will Click What's New
    Given User Is In Home Page
    Then Click on What's New
    And Chose  Some Categories "<category>"
    When User is in the category page
#    Then validate the  Page Headline "<headline>"
    And Page Title "<title>"
    Examples:
      | category             | headline           | title                                                 |
      | Women's New Arrivals | New Arrivals       | New Arrivals & 2022 Fashion Trends for Women : Target |
      | Men's New Arrivals   | Men's New Arrivals | Men's New Arrivals : Target                           |
      | Kids' New Arrivals   | Kids' New Arrivals | Kids' New Arrivals : Target                           |





