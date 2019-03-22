#Author: your.email@your.domain.com
Feature: Reset functionality on login page of Application
Scenario Outline: Verification of reset button with numbers of credentials
Given Open the Firefox and launch the application
When enter the Username  <username> and Password <password>
Then Reset the credential
Examples: 
|username |password				|
|"User11" |"password11"		|
|"User22" |"password22"		|
|"User33" |"password33"		|
