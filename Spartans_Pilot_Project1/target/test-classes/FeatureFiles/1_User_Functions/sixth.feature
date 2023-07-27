Feature: User Functionality for Cyclos Web Application

user should able to access the user profile functionality

 

 

Feature: UserFunction

@tag1

Scenario: UpdateProfile

Given Launch the Application

And Enter User Name

When Enter Password

Then Click profile and click Edit

And Enter Address

When Enter email

And Enter City

Then Click Save

 

@tag2

Scenario: Add Multiple Address

Given User should click on edit button

And click on Add address button

Then click on name text field

And enter the valid name

Then click on Address line1 text field

And enter the valid Address line1

Then Click on city text field

And enter the valid city

And Click on Zipcode text field

Then enter the valid Zipcode

And click on save button

 

@tag3

Scenario: Add Multiple Phone

Given User should click on AddMobile phone button

Then click on Mobile phone name text field

And enter valid Mobile phone name

Then click on Mobile phone number text field

And enter valid Mobile phone number

Then click on Add Multiple Phone button



@tag4

 

Scenario: Manage passwords

 

 

 

Given Click on Profile button

 

And Click on password

 

Then click on Change button

 

And enter the valid password in old password text field

 

And enter the valid password in new password text field

 

Then enter the valid password in password confirmation text field

 

And Click on Submit button

 

 

 

@tag5

 

Scenario: Notification preferences

 

 

 

Given Click on the Profile button

 

Then Click on notification

 

And Click on unread checkbox

 

 

 

@tag6

 

Scenario: Manage contacts

 

 

 

Given Click on profile button

 

Then Click on contacts

 

And Click on list view