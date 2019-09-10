@AllTests
Feature: Log in to Instagram

  @tag1
  Scenario: Attempt to log in
    Given I want to log in to Instagram

  @tag2
  Scenario: Fail to log in
    Given I want to log in to Instagram
    And I purposefully fail the test
    
  @tag3
  Scenario: Fail to log in
    Given I want to log in to Instagram
    And I purposefully fail the test

