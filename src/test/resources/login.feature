Feature: Log in function with valid and invalid credentials

  Background:User is on the user page
    Given User is on the login page

  Scenario: log in with valid credentials
    When User types "zehraRuby" to username box and "Proje15." to password box
    And User clicks Giris button
    Then User is launched to the dashboard page


  Scenario Outline: log in with valid credentials
    When User types "<username>" to username box and "<password>" to password box
    And User clicks Giris button
    Then User see error message on login page

    Examples:
      | username | password |
      | a        | king     |
      | king     | b        |
      | lion     | theo     |
      | tiger    | mila     |
