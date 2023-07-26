

@tag
Feature: Marketplace and advertisement
 

@tag1
Scenario: To customise the list of  new advertisement field 
Given Click on Advertisements
And Click on show advertisements
And Click  on Order By drowpdown
Then Select the user choice

@tag2
Scenario: To browse the advertisement in which category the user needs
Given Click on advertisemnts
And Click on keywords search text fields
Then Click Enter

@tag3
Scenario: To verify the advertisement functionality with multiple advertisemnt category
Given Launch the Application with URL
And Click on the Advertisements in the Marketplace
And Click on the Community 
Then Community related Advertisements will appear

@tag4
Scenario: To add a customized search for a advertisement field
Given Click on Advertisements
And Click on Community field
And Click on Activity Field
Then Click on which activity you want





