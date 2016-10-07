@RegressionAndroid @TopTagTest
Feature: Like a User i want find and select a Specific Top Tag 

	#Scenario 1
	Scenario Outline: The user requests find a any Contact
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on Top Tags tab
		Then  I see one list of all Top Tags used
		When I click on find a specific Tag
			And type the next Tag Name "<tagName>"
			And I click over the field of this tag "<tagName>"
		Then I see one list of all contacts with points in this Tag "<tagName>"
			And I finally Logout of App

	Examples:

	|  username  | password | tagName    | 
	| rrashuaman | belatrix | ANDROID    |