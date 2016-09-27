@iOS @iOSLoginTest1
Feature: Login Scenarios

	#Scenario 1
	Scenario Outline: Login with correct values
	Given I open the app on iOS
	And I login with this "<username>" and this "<password>" values on iOS
	Then I see my user profile page on iOS
	And I logout of the App on iOS
	When I confirm the message displayed on iOS
	And App login should appears on iOS

	Examples:
	|  username  | password |
	| gvelasquez | belatrix |
	| rrashuaman | belatrix |