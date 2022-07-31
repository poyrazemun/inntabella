@INN-1638 @nur
Feature: Add Event 2

	Background:
		#@INN-1607
		Given the user logged in as "store manager"
		Then the user navigates to "Fleet" "Vehicles"
		

	#The store manager should be able to mark the event with any color at the "Add Event" pop-up.
	@INN-1631 @INN-1638
	Scenario: Mark event with any color
		When the user clicks on any car on the table
			And the user lands on General Information page
			And clicks on add event button
			And "Add Event" page pops up
			Then user clicks one "color"

	#The store manager should be able to mark the event as an "All-day event"
	@INN-1632 @INN-1638
	Scenario: Mark All-day event
		When the user clicks on any car on the table
			And the user lands on General Information page
			And clicks on add event button
			And "Add Event" page pops up
			Then user click "All-day event" checkbox	

	#The store manager should be able to repeat the actions from the repeats dropdown menu:
	#Repeat options should include the options as follows: Daily, Weekly, Monthly, Yearly
	@INN-1633 @INN-1638
	Scenario: Repeating actions - time period
		When the user clicks on any car on the table
			And the user lands on General Information page
			And clicks on add event button
			And "Add Event" page pops up
			And user clicks "repeat" checkbox
			Then user can choose "time period" #Daily, Weekly, Monthly, Yearly	

	#Ending options should be as below and clickable by the store manager while adding an event: Never, After, By
	@INN-1634 @INN-1638
	Scenario: Repeating actions - Ending
		When the user clicks on any car on the table
			And the user lands on General Information page
			And clicks on add event button
			And "Add Event" page pops up
			And user clicks "repeat" checkbox
			Then user can choose "ending option" #Never, After, By	

	#Users can see all events on the General information page
	@INN-1635 @INN-1638
	Scenario: Events on general Information page
		When the user clicks on any car on the table
			And the user lands on General Information page
			Then sees calender event at the bottom of the page