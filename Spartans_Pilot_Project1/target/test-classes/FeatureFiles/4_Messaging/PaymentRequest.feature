Feature: Payment Requests
User should login to the cyclos website and make payment request
@tag1
Scenario: User should request the amount
Given User should launch the cyclos website and login with the Correct credentials
And click on banking option
And click on payment request
When User click an send a new request
And Pick the receiver from contact book
And Enter the amount
And enter the expiry date
And Click the recurring payments in scheduling
And select the occurance option
And enter description in the textarea
Then Click confirm
And click confirm option in reconfirmation tab
Then Check if the transaction is successfully completed or not