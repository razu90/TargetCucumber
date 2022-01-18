Feature: Check Functionality For What's New Page

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @CheckDealsFunction
  Scenario Outline: From The Home Page User Will Click What's New
    When User Clicked on What's New
    And Chose  Some Categories "<category>"
    Then User is in the category page
    And validate the  Page Headline "<headline>"
    Examples:
      | category             | headline     |
      | Women's New Arrivals | New Arrivals |





