Feature: Test number of circuits for year 2017

Scenario: Number of circuits test scenario

Given url for get request
When user sends request
Then status code is 200
And size of circuit id is 20
And response headers includes the following
	|Proxy-Connection|Keep-Alive|