#Author: Surbhi Gupta

Feature: Submit functionality on login page of Application
Background: User has launch the application and is on the form page

Scenario: check the title
Given User is on form page
Then check the title of the page

Scenario: Successful completion of form
Given User is on form page
When user enters all valid data 
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the UserName empty 
Given User is on form page
When user leaves UserName blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the Password empty 
Given User is on form page
When user leaves Password blank 
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the ConfirmPassword empty 
Given User is on form page
When user leaves ConfirmPassword blank 
And clicks the button
Then display alert msg

Scenario: Failure in completion of form Password and ConfirmPassword do not match
Given User is on form page
When user enters different Password and ConfirmPassword 
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the FirstName empty 
Given User is on form page
When user leaves FirstName blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the LastName empty 
Given User is on form page
When user leaves LastName blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form due to not selecting gender
Given User is on form page
When user does not select gender
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the DateofBirth empty 
Given User is on form page
When user leaves DateofBirth blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the Email empty 
Given User is on form page
When user leaves Email blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the Address empty 
Given User is on form page
When user leaves Address blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the City empty 
Given User is on form page
When user leaves City blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form leaving the Phone empty 
Given User is on form page
When user leaves Phone blank
And clicks the button
Then display alert msg

Scenario: Failure in completion of form due to not selecting hobbies
Given User is on form page
When user does not select hobbies
And clicks the button
Then display alert msg