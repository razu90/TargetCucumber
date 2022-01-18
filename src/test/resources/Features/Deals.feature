Feature: Check Deals Functionality

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @CheckDealsFunction
  Scenario Outline: Validate various deals
    When the user clicks on Deals
    And Chose on going Deals "<deals>"
    Then validate the title And Url contains "<title>"  "<url>"

    Examples:
      | deals              | title                                                     | url                                                             |
      | Clearance          | Clearance : Save on Thousands of Clearance Items : Target | https://www.target.com/c/clearance/-/N-5q0ga?lnk=dNav_clearance |
      | RedCard Exclusives | RedCard : Save 5% at Target                               | https://www.target.com/redcard/about?lnk=dNav_redcardexclusives |