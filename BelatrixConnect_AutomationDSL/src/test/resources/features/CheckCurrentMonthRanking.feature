@Regression @RankingTest
Feature: View the Current Month Ranking

	#Scenario 1
	Scenario Outline: Like a user requests view the current month ranking
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on ranking Tab
		Then  I see the Currement Month rank deafult
			And I check the current Month Rank
			And I finally Logout of App
		
	Examples:
	|  username  | password |
	| gvelasquez | belatrix |