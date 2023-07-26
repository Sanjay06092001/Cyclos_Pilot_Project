@tag
Feature: Banking Account Information

Background:
	Given Launch the Application in ChromeBrowser
	And Enter the UserName Password
	When User click on submit button
  Then User Should click on Banking Menu
  

  @Tag1
  Scenario: View Account Summary
  And Check in the Member Account

  @Tag2
  Scenario Outline: View Current Balance
  And Check in the Available Balance in the Member Account

  @Tag3
  Scenario Outline: View Payment History
  When user click on notification
  Then user can see the Payments History

 @Tag4
  Scenario Outline: Print and Export Payment
  When clicking on payment to usertab in banking
  Then click on the pickfromyourcontactlist in touser
  And click anyone from the select a contact
  Then Enter the Amount
  And click on next button
  When click on confirm
  #Then click the print to confirm the payment details downloaded

 @Tag5
  Scenario Outline: Search Payments
  And click on the Showfilter button 
  And Select the pickfromyourcontactlist on book icon
  When user click anyone from the select a contact
  Then click on the period menu
  And Select any oneoption
  Then select the description enter the content
  And click on the From amount Enter the amount 
  And click on the To amount Enter the amount 
  Then click the filter option
  And Select anyone Option
  Then click on the Transaction number
  And Enter the Transaction Number
  Then click the Direction option
  And Select anyone Option in direction
  And click the orderBy option 
  Then Select anyone from orderby	

  @Tag6
  Scenario Outline: View Payment Details
  When click anyone from the Account Summary
  Then payment Details will be Appear to User

  @Tag7
  Scenario Outline: Print Payment Details
  When click anyone from  Account Summary
  Then click on the print button in the transferDetails
