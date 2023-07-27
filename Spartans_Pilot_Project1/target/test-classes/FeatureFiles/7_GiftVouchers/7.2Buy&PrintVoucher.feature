@tag
Feature: Gift Voucher Option
User should be able to buy the voucher and print it
Background: The user launches the application and login then buy a gift voucher
When The user launches url
And logins to website
And goes into market place tab
And clicks my vouchers
And clicks on buy and email button
@tag1
Scenario: User should be able to purchase Cinema voucher and print gift voucher
When user clicks cinema voucher
And enters the mail
And clicks next in cinema voucher
And Click Confirm
And clicks print
Then Check if the transaction is successful
@tag2
Scenario: User should be able to purchase gift voucher and print gift voucher
When user clicks gift voucher
And enters the mail
And clicks next in gift voucher
And Click Confirm
And clicks print
Then Check if the transaction is successful
@tag3
Scenario: User should be able to purchase restaurant voucher and print gift voucher
When user clicks restaurant voucher
And enters the mail
And clicks next in restaurant voucher
And Click Confirm
And clicks print
Then Check if the transaction is successful