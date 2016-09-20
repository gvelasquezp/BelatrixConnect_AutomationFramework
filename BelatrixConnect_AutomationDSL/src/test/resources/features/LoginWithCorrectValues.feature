@Regression @LoginTest1
Feature: Login Scenarios

	#Scenario 1
	Scenario Outline: Login with correct values
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see my user profile page
	When I logout of the App
	And I confirm the message displayed 
	Then App login should appears

	Examples:
	|  username  | password |
	| gvelasquez | belatrix |