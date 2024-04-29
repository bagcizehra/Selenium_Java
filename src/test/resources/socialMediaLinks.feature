Feature: Social Media Links functionality
  Background:
    Given User is on the login page
    When User types "zehraRuby" to username box and "Proje15." to password box
    And User clicks Giris button
    Then User is launched to the dashboard page

  Scenario Outline: Instagram link works as expected
    When User scrolls down the page
    And User clicks on "<socialMediaType>" icon
    Then User can see socialMedia account in new tab
    Examples:
    |socialMediaType|
    |instagram|
    |youtube|
    |linkedIn|

