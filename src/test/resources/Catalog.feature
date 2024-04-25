@Login
Feature: Login
  As user, I want to be able to login with username and password

Scenario: Login as manager
  Given user logs in as "catalogusername"
  Then user is logged in successfully

