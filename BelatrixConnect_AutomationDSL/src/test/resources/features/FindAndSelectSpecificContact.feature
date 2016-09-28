@Regression @ContactTest
Feature: Like a user requests find a specific Contact

	#Scenario 1
	Scenario Outline: The user requests find a specific Contact
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on Side bar Menu
			And I click on Contacts Option
		Then  I see one list of all contacts
			When I click on find a Contact
			And type the next Contact "<contact>"
			And click over the field of this Contact "<contact>"
		Then I should see the Profile User finded
			And I back on Pages to Logout of APP
			And I finally Logout of App

	Examples:

	|  username  | password | contact                   |
	| gvelasquez | belatrix | Juan Bryan Estrada Acosta |
