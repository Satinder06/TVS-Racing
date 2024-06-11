
Feature: I want to validate the functionalities of the programmes live on the tvs racing website
 

  @test1
  Scenario: check for the tvs training academy programe
    Given user is on the tvs training academy program
    When  user go through the page
    Then it should work as expected
    
    
  @test2
  Scenario: check for the ARE programe
    Given user is on the ARE program
    When  user navigates through the page
    Then all the page funtionalities should work as expected

    #@test3
    #Scenario: Check for the Rookie program
    #Given user is on the Rookie program
    #When  user navigates through the rookie page
    #Then all the page funtionalities of rookie should work as expected
    
    #@test4
    #Scenario: Check for the Women program
    #Given user is on the women program
    #When  user navigates through the women program page
    #Then all the page funtionalities of women program should work as expected
    
    