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
#
#Feature: Send Rich Text Message
#
#Scenario: Send a Rich Text Message to a User
  #Given I am on the messaging page
  #When I click on the "New message" button
  #And  select a user from the contact list
  #And we have enter the subject "Your Subject Here"
  #And  select the font "Arial" for the message
  #And  Apply italics style to the message
  #And I enter the following rich text message content:
    #"""
    #Your rich text message here.
    #This can include formatted text, such as bold, italics, links, etc.
    #"""
  #And  click the "Send" button
  #Then the message should be sent successfully
#
#Scenario: Send a Rich Text Message to a User
