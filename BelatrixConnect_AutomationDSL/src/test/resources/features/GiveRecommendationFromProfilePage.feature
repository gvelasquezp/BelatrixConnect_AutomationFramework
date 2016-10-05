@Regression @GiveComment1
Feature: Like a User i want give a recommendation from my profile Page

	#Scenario 2 
	Scenario Outline: The user requests find a specific Contact
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on button give a Recommendation
		Then I should see the Give a Recommendation page
			And I check the button done is disabled
		When I click on select a user option
		Then  I see one list of all contacts
		When I click on find a Contact
			And type the next Contact "<contact>"
			And click over the field of this Contact "<contact>"
		Then I should see the contact "<contact>" selected
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

	|  username  | password | comment                                     |contact                   | category  | subCategory | tag           |
	| rrashuaman | belatrix | this is a comment of automation test        |Juan Bryan Estrada Acosta | Coworker  | Demo        | ANDROID       |