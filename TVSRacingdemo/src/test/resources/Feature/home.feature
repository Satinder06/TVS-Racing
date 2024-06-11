
Feature: Verify the home page functionalities
  

 
  Scenario: To verify that the home page functionalities are working fine till upcoming races section
    Given I am on the tvs racing site
    When I scroll down and check the functionalities 
    And User clicks on the upcoming races dropdown
    Then user should be able to navigate through it seamlessly
    
    