@Regression @RankingTest
Feature: View the Last Month Ranking

	#Scenario 1
	Scenario Outline: Like a user requests view the last month ranking
		Given I login with my "<username>" and my "<password>"
			And I'm on my profile page
		When I click on ranking Tab
			And I see the Currement Month rank deafult
		Then  I click on Last Month ranking
			And I check the last Month Rank
			And I finally Logout of App

	Examples:
	|  username  | password |
	| rrashuaman | belatrix |