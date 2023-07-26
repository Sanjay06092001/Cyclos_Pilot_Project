Feature: Payment to System
User should login to the cyclos website and make payment to the Own account
Background: 
	Given User should launch the cyclos website and login with  valid credentials
	And click on banking module
	And click on payment to System
	And click on amount field and enter amount

@tag1
Scenario: User should transact the amount to own account by scheduled methods
When Select the scheduling option to select scheduled
And User Enter the due date
And enter some description in the textbox 
And click next button
And confirm the payment
Then Check if the transaction is successfully executed or not

@tag2
Scenario: User should transact the amount to own account by monthly installments
When Select the scheduling option to select monthly installment
And Enter the Number of installements
And click the installment option now
And enter some description in the textbox for the user needs
And click next
And confirm the payment and click confirm
Then Check if the transaction is successful or not