Feature: post request using resreq site

Scenario: post a rest request api

Given post url for send request
When user post request
Then post request status code is 201
And post response body contains
		|name|morpheus|
		|job |leader  |
And post response headers contains
		|Connection  |keep-alive      				 |
		|Content-Type|application/json; charset=utf-8|
 