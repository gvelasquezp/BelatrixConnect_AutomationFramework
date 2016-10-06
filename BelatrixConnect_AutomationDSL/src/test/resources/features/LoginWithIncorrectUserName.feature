@Regression @LoginTest
Feature: Login with incorrect user name

	#Scenario 1
	Scenario Outline: Login with incorrect username
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:
	|   username  | password |
	| gvelasquess | belatrix |