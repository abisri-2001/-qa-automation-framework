Feature: OrangeHRM Login Functionality

  Scenario Outline: Login with different credentials

    Given the user is on the OrangeHRM login page
    When the user enters username "<username>" and password "<password>"
    And the user clicks the Login button
    Then the login result should be "<expectedResult>"

    Examples:
      | username  | password | expectedResult |
      | Admin     | admin123 | Valid          |
      | Admin     | wrong123 | Invalid        |
      | WrongUser | admin123 | Invalid        |
      | WrongUser | wrong123 | Invalid        |