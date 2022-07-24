@INN-1613
Feature: Vehicle Table Arrangements

  Background: User is already logged in and navigated to Fleet Vehicles Page
		#@INN-1607
    Given the user logged in as "store manager"
    Then the user navigates to "Fleet" "Vehicles"


  @INN-1608
  Scenario: Verify that the values of View Per Page is 25 by default

    Then user sees the value of View Per Page as "25"

  @INN-1609
  Scenario: Verify that View Per Page includes 10,25,50 and 100

    When user clicks the View Per Page dropdown menu
    Then user should see "10","25","50" and "100"

  @INN-1610
  Scenario: Verify that user can arrange rows/vehicle numbers by clicking on the View Per Page button

    When user clicks 10 under the View Per Page dropdown menu
    Then user should see 10 vehicle information

  @INN-1611
  Scenario: Verify that user can sort a column in ascending or descending order by clicking the column name

    When user clicks on the column name
    Then user sorts a column in ascending order
    And user clicks on the column name
    Then user sorts a column in descending order


  @INN-1612
  Scenario: Verify that user can remove all sortings and filter on the page by using the reset button

    When user clicks on the column name
    Then user sorts a column in ascending order
    And user clicks on the reset button
    Then user removes all sortings and filter