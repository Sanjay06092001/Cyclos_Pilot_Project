Feature: Payment to User
User should login to the cyclos website and make payment to the another user
@tag1
Scenario: User should transact the amount to another user
Given User should launch the cyclos website and login with the valid credentials
And click on banking
And click on payment user
When User select the list of user and click the which user want to sent
And click on amount field and enter amount to transfer
And enter some description in the textbox for the user needs
And click next
And confirm the payment and click confirm
Then Check if the transaction is successful or not
