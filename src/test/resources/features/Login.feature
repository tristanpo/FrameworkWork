Feature: Validation of login scenarios

  Background: #Given user is navigated to the BackOffice application

  Scenario: Power User Login
    #Given user is navigated to the BackOffice application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in