@iOS @iOSLoginTest3
Feature: Login with incorrect password

	#Scenario 1
	Scenario Outline: Login with incorrect password
	Given I open the app on iOS
	And I login with this "<username>" and this "<password>" values on iOS
	Then I see an error message for invalid login on iOS

	Examples:
	|  username  |   password  |
	| gvelasquez | belatrix123 |
	| rrashuaman | belqtrix123 |