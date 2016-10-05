@iOS @iOSLoginTest4
Feature: Login after Password Recovered

	#Scenario 1
	Scenario Outline: Login after Password Recovered
	Given I open the app on iOS
	And I login with this "<username>" and this "<password>" values on iOS
	Then I see an error message for invalid login on iOS
	And I go to Forgot Password option on iOS
	When I request my New Passowrd after input my Email "<Email>" on iOS
	And I confirm the message of password Recovery displayed on iOS
	And App login should appears on iOS

	Examples:
	|  username  | password | Email                     |
	| gvelasquez |  wrong   | gvelasquez@belatrixsf.com | 
	| rrashuaman |  wrong   | gvelasquez@belatrixsf.com | 