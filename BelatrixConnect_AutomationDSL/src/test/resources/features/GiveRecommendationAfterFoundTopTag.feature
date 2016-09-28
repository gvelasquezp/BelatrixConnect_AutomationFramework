@Regression @GiveComment
Feature: Like a User i want give a recommendation after found top Tag

	#Scenario 2 
	Scenario Outline: The user requests find a specific Contact
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on Top Tags tab
		Then I see one list of all Top Tags used
		When I click on this Tag Name "<tagName>" of the list
		Then I see one list of all contacts with points on page "<tagName>"
		When I click on this contact "<contactName>" of the list
			And I see the profile of the contact "<contactName>" selected
			And I click on Recommend Option
		Then I should see the Give a Recommendation to contact "<contactName>"
			And I check the button done is disabled
		When I click in select a Category
			And select a Category as "<category>" 
			And Select a Subcategory as "<subCategory>" 
		Then I should see the Subcategory as "<subCategory>" selected in a first field
		When I click in Write a comment
			And I write a comment "<comment>"
			And I click in Done 
		Then I should see the commend "<comment>" wrote in in a second field
		When I click in select a Tag
			And I select a Tag "<tag>"
		Then I should see the Tag "<tag>" selected in the last field
			And I check the button done now is enable
		When I click Done button 
		Then I should see the message of action done successfully
			And I confirm the success message
			And I back the page to exit of the App
			And I finally Logout of App

	Examples:

	|  username  | password | tagName | comment                                     |contactName | category  | subCategory | tag           |
	| rrashuaman | belatrix | ANDROID | this is a comment of automation test        |Ivan Cerrate| Coworker  | Demo        | ANDROID       |