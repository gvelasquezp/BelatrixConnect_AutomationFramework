@RegressionAndroid @LoginTest
Feature: Login with incorrect password

	#Scenario 1
	Scenario Outline: Login with incorrect password
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:
	|   username  | password  |
	| gvelasques  | belatrix1 |