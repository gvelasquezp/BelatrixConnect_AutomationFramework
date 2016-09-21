@Regression @ContactTest
Feature: Like a user request find and select any Contacts

	#Scenario 1
	Scenario Outline: The user requests find a any Contact
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on Side bar Menu
			And I click on Contacts Option
		Then  I see one list of all contacts
		When I click over one user of the list
		Then I should see the Profile User selected
			And I finally Logout of App

	Examples:

	|  username  | password | 
	| gvelasquez | belatrix | 