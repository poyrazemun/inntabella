Feature: Login to the app

  Background: User is already logged in

  @login
  Scenario:Verify user can login with valid credentials.
    Given the user logged in as "driver"
    When the user navigates to "Fleet" "Vehicles"




