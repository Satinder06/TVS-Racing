Feature: To check the contact us page functionalities
  
Scenario: Check the contact us page functionalities are working as expected for all the programs

Given User is on the contact us page
When User fills up the form
And click on Get started button
Then USer should navigate to the payment page and able to complete the registration for the specific program
And comes back on the home page