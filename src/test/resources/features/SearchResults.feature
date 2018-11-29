Feature: Verify Search Results Page

  @smoke_1 @regression
  Scenario: Home page -  Verify SignIn icon on Home Page
    Given I visit the web site as a guest user
    And I click on Sign in  button on Home page
    Then I should be redirected to Login page

