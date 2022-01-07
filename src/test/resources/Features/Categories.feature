Feature:Check Categories Functionality

  @ChoseDifferentCategories
  Scenario Outline: From The Home Page User Will Click Different Category
    Given User Is In Home Page
    Then Click on categories
    And Chose  1st "<category1>"
    Then Chose 2nd "<category2>"
    And chose the item "<item>"
    Then validate the title contains "<title>"
    Examples:
      | category1   | category2       | item                | title                           |
      | Men         | Men's Clothing  | Jeans               | Men's Jeans : Target            |
      | Women       | Women's Jewelry | Earrings            | Earrings for Women : Target     |
      | Kids        | Girls' Clothing | Coats & Jackets     | Girls' Coats & Jackets : Target |
      | Home        | Smart Home      | Smart Lighting      | Smart Lighting : Target         |
      | Electronics | Cameras         | Digital SLR Cameras | DSLR Cameras : Target           |
      | Grocery     | Beverages       | Juice & Cider       | Juice & Cider : Target          |

