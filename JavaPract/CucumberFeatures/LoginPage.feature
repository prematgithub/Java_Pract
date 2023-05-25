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
Feature: Facebook Login page feature
  I want to use this template Login page feature file
  
  Background: Pre condition
  Given I am the user of facebook application

  @tag1
  Scenario: Validate login page with valid data
    When I enter valid username
    And I enter valid password
    And I click on login button
    Then I should be able to login successfully
    

  @tag2
  Scenario: Validate login page with invalid data
    When I enter invalid username
    And I enter invalid password
    And I click on login button
    Then I should not be able to login successfully