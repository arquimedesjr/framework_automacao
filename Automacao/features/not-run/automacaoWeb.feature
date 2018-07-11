Feature: Automação Web 

Scenario Outline: Test

	Given inicio a aplicação "<URL>"
	When insiro um texto "<texto>"
	
	Examples:
	|URL						  |texto     |
	|https://translate.google.com/|texto	 |
	|https://translate.google.com/|oi		 |
	
	
		