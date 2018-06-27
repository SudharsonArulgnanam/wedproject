Feature: Login the testLeaftab

@smoke @regression
Scenario Outline: Login the Leaftab application

Given open the browser
And maximize the browser
And Enter the url
And enter the username
And enter the password
And click on the login button
And User should navgivate to the testleafhome page
And click on the CRM/SFA
And click on the Leads tab
And click on the create lead
And enter the company name <company>
And enter the first name <firstname>
And enter the last name <lastname>
When click on the submit buttons
Then verify whether the lead is created succesfully with the first name and last name


Examples:

|company|firstname|lastname|
|cts|sudharson|arulgnanam|
|zoho|bhasith|jallel|



@regression @sanity
Scenario Outline: Login the Leaftab application

Given open the browser
And maximize the browser
And Enter the url
And enter the username
And enter the password
And click on the login button
And User should navgivate to the testleafhome page
And click on the CRM/SFA
And click on the Leads tab
And click on the create lead
And enter the company name <company>
And enter the first name <firstname>
And enter the last name <lastname>
When click on the submit buttons
But verify whether the lead is created succesfully with the first name and last name


Examples:
|company|firstname|lastname|
|cts|sudharson|arulgnanam|
|zoho|bhasith|jallel|
 