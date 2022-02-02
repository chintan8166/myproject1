#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Google page
  @tag1
  Scenario: demoblaze
  
    Given Open a browser
    And User must on Product Store Home page
     When User click on signup button
    And Signup box is displayed
   Then user enter username & password
   And user click on Sign Up
   Then user should get successful message
   
    
@tag2
Scenario: Login into account

Given click on log in
And enter username & password
Then click on log in button
 
@tag
Scenario: Add to cart

Given click on one product
And add to cart
Then go to cart
Then confirm product is added
 