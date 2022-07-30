@INN-1605
Feature:As a user I should be able to log out


 #User can log out by using log out button inside profile info and ends up in login page.
  @INN-1602
  Scenario: logging out by using log out button
    Given the user logged in as "driver"
    Given user is on Profile Menu
    When user click logout button
    Then users should land on the login page.

 # The user can not go to the home page again by clicking the step back button after successfully logged out.
  @INN-1603
  Scenario: Not going to the home page again by clicking the step back button after successfully logged out.
    Given the user logged in as "driver"
    Given user is on Profile Menu
    Given user click logout button
    Given user clicks step back button
    Then user should be still on the login page

 #The user must be logged out if the user close the tab (if there are multiple open tabs in the app, close all of them)
  @INN-1604
  Scenario: Staying logged out if the user close the tab
    Given the user logged in as "driver"
    Given user is on Profile Menu
    Given user clicks close the tab button and open a new page.
    Then user should be on login page