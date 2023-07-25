@tag
Feature: Print Voucher
I want to log in into the website and print my Voucher
@tag1
Scenario: Print the voucher from my voucher
Given The user logs in with the valid credentails
And is in the marketplace tab
And is in my vouchers
When I click on one of my vouchers
And click print
Then I download the voucher
And print the voucher