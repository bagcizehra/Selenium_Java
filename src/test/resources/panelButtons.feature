Feature: DashBoard top-area buttons functionality
Background:
  Given User is on the login page
  When User types "zehraRuby" to username box and "Proje15." to password box
  And User clicks Giris button
  Then User is launched to the dashboard page

  Scenario: Language Button
    Given language button needs to be "TR"
    When User clicks language button
    Then language button needs to be "EN"

    Scenario: Theme Button
Given Theme button needs to be "oto"
      When User clicks theme button
      Then Theme button needs to be "koyu"
      And User clicks theme button
      Then Theme button needs to be "açik"

      Scenario: Profile Button
        When User clicks profile button
        Then User is launched to the dashboard page

        Scenario: Log-Out Function
          When User clicks Cikis button
          Then Title needs to contain "Erişim Engellendi"



