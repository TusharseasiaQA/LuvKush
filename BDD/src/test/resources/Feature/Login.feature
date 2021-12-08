@loginFunc
Feature: Login functionality

  Background: Prerequisites
    Given User is on login page

  @ValidLogin
  Scenario: User login with valid credential
    When User fill valid credentials and click on login button
    Then Verify user is logged in

  @InvalidLogin
  Scenario Outline: User login with invalid credential or blank credential
    When User fill username as "<username>" and password as "<password>" and click on login button
    Then Verify the error message "<error_message>"

    Examples:
      |username|password|error_message           |
      |admin   |wrong   |Invalid credentials     |
      |wrong   |admin123|Invalid credentials     |


