Feature: Check Secondary Navigation Bar Functionality

  Background:
    Given the user is on Home Page
    Then the user should see the title

  @MyStore
  Scenario: Validate My Store Functionality
    When user clicks on My Store form the Secondary Navigation Bar
    Then User Validate The Manu Bar Functionality

  @MultipleTab
  Scenario Outline: Validate Multiple Tab Functionality
    When User Clicks On Multiple Tab "<Tab>" form the Secondary Navigation Bar
    Then User Validate The Xpath "<xPath>"
    Examples:
      | Tab         | xPath                                            |
      | Registry    | //*/h2[text()='Celebrate any milestone']         |
      | Weekly Ad   | //*/h3[text()='Weekly Ads & Catalogs']           |
      | RedCard     | //*/h2[text()='Everyday RedCard benefits']       |
      | Gift Cards  | //*/span[text()='Something for everyone']        |
      | Find Stores | //*/h1[text()='Find a store']                    |
      | Orders      | //*/span[text()='Sign into your Target account'] |


  @MoreTab
  Scenario Outline: Check More tab Functionality
    When User Clicked On More For the Secondary Navigation Bar
    And Select Navigation List "<NavList>"
    Then Validate The Page Headline "<ModifiedHeadline>"
    Examples:
      | NavList                     | ModifiedHeadline             |
      | Shipping and Order Services | 'Shipping & Order Services'] |
      | Target App                  | 'Target App']                |
      | Pharmacy                    | 'Pharmacy']                  |
      | Gift Ideas                  | 'Gift Ideas']                |

