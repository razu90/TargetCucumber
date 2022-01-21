Feature: Check Categories Functionality

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @ChoseDifferentCategories
  Scenario Outline: Validate page title with different categories and item
    When user clicks on categories
    And Chose "<category1>" "<category2>" "<item>"
    Then validate the title contains "<title>"
    Examples:
      | category1   | category2       | item                | title                           |
      | Men         | Men's Clothing  | Jeans               | Men's Jeans : Target            |
      | Women       | Women's Jewelry | Earrings            | Earrings for Women : Target     |
      | Kids        | Girls' Clothing | Coats & Jackets     | Girls' Coats & Jackets : Target |
      | Home        | Smart Home      | Smart Lighting      | Smart Lighting : Target         |
      | Electronics | Cameras         | Digital SLR Cameras | DSLR Cameras : Target           |
      | Grocery     | Beverages       | Soda & Pop          | Soda & Pop : Target             |
#    -----------------------------------------------------------------------------------------------------
#    i tried to validate the page headline, but problem is it keep changing. that's why i validate the page title.