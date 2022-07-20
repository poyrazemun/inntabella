@INN-1601
Feature: Delete Car

	Background: User is already logged in
		Given the user logged in as "store manager"
		When the user navigates to "Fleet" "Vehicles"


	#User Story :
	#
	#As Store Manager, I should be able to delete a car
	#
	#
	#Acceptance Criteria:
	#
	#Users can see the delete button by hovering over the three dots at the end of each row
	@INN-1595
	Scenario: User can see the "Delete" button by hovering the mouse
		When the user hovers the mouse over the three dots
		Then the user should see the 'delete' option	

	#User Story :
	#
	#As Store Manager, I should be able to delete a car
	#
	#
	#Acceptance Criteria:
	#
	#"Delete Confirmation" pops up should be displayed when the user clicks on the delete button
	@INN-1596
	Scenario: Delete Confirmation pops up
		When the user clicks on delete icon
		Then delete confirmation window pups up	

	#User Story :
	#
	#As Store Manager, I should be able to delete a car
	#
	#
	#Acceptance Criteria:
	#
	#'Store Manager' can delete any car by clicking on the delete button at the end of each row and the "Item deleted" message should be displayed
	@INN-1597
	Scenario: "Item deleted" message displayed
		When the user hovers the mouse over the three dots
		And the user clicks on delete icon
		And the user confirms the delete
		Then "Item deleted" message is displayed	

		#User Story :
	#
	#As Store Manager, I should be able to delete a car
	#
	#
	#Acceptance Criteria:
	#When 'Store Manager' go to the 'General Information' page by clicking on any vehicle/row, they can delete any vehicle by clicking on the 'Delete' button and the "Car deleted" message should be displayed.
	@INN-1598
	Scenario: Store Manager can delete the car from the general information page
		When the user clicks on any car on the table
		And the user lands on General Information page
		And clicks on delete button
		And the user confirms the delete
		Then the "Car deleted" message should be displayed	

		#User Story :
	#
	#As Store Manager, I should be able to delete a car
	#
	#
	#Acceptance Criteria:
	#When 'Store Manager' deletes a car, the corresponding car should also be removed from the Fleet-Vehicle page.
	@INN-1599
	Scenario: The deleted car is removed from the table
		When the user clicks on any car on the table
		And the user lands on General Information page
		And clicks on delete button
		And the user confirms the delete
		Then the deleted car is removed from the table