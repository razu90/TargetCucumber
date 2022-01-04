Feature: Will Check Sign in Function

  @PositiveTest
  Scenario: User Will Sign In Successfully With Valid Credential
    Given User Is In Home Page
    Then From The Home Page User Will Click On Sign In Button
    And Click On Sign In From The DropDown Menu
    When User Is In Sign In Page User Enter username "razu.qatek@gmail.com" and password "Qatek2021"
    And Click Login
    Then User Navigated To Home Page

    @NegativeTest
    Scenario: User Can Not Sign In Successfully With Invalid Credential
      Given User Is In Home Page
      Then From The Home Page User Will Click On Sign In Button
      And Click On Sign In From The DropDown Menu
      When User Is In Sign In Page User Enter username "raju.qatek@gmail.com" and password "Qatek2021"
      And Click Login
      Then User See  Error Msg