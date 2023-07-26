@tag
Feature: Payment to System
User should login to the cyclos website and make payment to the Own account
@tag1
Scenario: User should transact the amount to own account
Given User should launch the cyclos website and login with the valid credentials
And click on banking
And click on payment to System
And click on amount field and enter amount to transfer
And Select the scheduling option to select anyone feature
And enter some description in the textbox for the user needs
And click next
And confirm the payment and click confirm
Then Check if the transaction is successful or not