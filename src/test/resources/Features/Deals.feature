Feature: Here User Will Chose Some Categories

  @CheckDealsFunction
  Scenario Outline: From The Home Page User Will Click Deals
    Given User Is In Home Page
    Then Click on Deals
    And Chose  on going Deals "<deals>"
    Then validate the title contains "<title>"
    And Page Url "<url>"
    Examples:
      | deals              | title                                                     | url                                                             |
      | Clearance          | Clearance : Save on Thousands of Clearance Items : Target | https://www.target.com/c/clearance/-/N-5q0ga?lnk=dNav_clearance |
#      | Weekly Ad          | Weekly Deals In Stores Now : Target Weekly Ad             | https://weeklyad.target.com/?lnk=dNav_weeklyad                  |
#      | Top Deals          | Target Coupons, Promos & Deals                            | https://www.target.com/c/top-deals/-/N-4xw74?lnk=dNav_topdeals  |
#      | RedCard Exclusives | RedCard : Save 5% at Target                               | https://www.target.com/redcard/about?lnk=dNav_redcardexclusives |



