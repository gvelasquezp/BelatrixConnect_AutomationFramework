@iOS @iOSLoginTest2
Feature: Login Scenarios

	#Scenario 1
	Scenario Outline: Login with incorrect username
	Given I open the app on iOS
	And I login with this "<username>" and this "<password>" values on iOS
	Then I see an error message for invalid login on iOS

	Examples:
	|   username  | password |
	| gvelasquess | belatrix |
	| rrashuamann | belqtrix |