Feature: As a user, I should be able to log in using valid credentials
 @wip
  Scenario: Login as Driver
    When driver enters username "user13" and password "UserUser123"
    And driver clicks login button
    Then driver should land on the "Quick Launchpad" page

  Scenario: Login as Sales Manager
    When Sales Manager enters username "SalesManager101" and password "UserUser123"
    And Sales Manager clicks login button
    Then Sales Manager should land on the "Dashboard" page

  Scenario: Login as Store Manager
    When Store Manager enters username "StoreManager51" and password "UserUser123"
    And Store Manager clicks login button
    Then Store Manager should land on the "Dashboard" page


