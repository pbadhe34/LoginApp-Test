 
Feature: Login and logOut Action

Scenario: Successful Login and with Valid Credentials and logout
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
   
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
