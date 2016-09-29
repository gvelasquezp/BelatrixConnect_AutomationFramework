@Regression @RankingTest
Feature: View the Ranking of all the time

	#Scenario 1
	Scenario Outline: The user requests view the all time rank
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on ranking Tab
			And I see the Currement Month rank deafult
		Then  I click on all time rank
			And I check the all time Rank
			And I finally Logout of App
		
	Examples:
	|  username  | password |
	| rrashuaman | belatrix |