Feature: Automação Mobile

Scenario Outline: Test

	Given inicio a conexao com o appium
	When clico no menu
	And clico no numero "<numero>"
	
	Examples:
	|numero|
	|2	   |
	