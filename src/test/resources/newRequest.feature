@smokeTest
Feature: As a pricing merchant
I would like to create and save a new request
so that I can submit Price changes


  Scenario: Happy Path - Save a new request
    Given Sample feature file is ready
    When I run the feature file
    Then Run should be successful