Feature: Login

  Scenario:
    Given I navigate to main page
    And I click on FormAuthentication link
    When I enter username "tomsmith"
    And I enter password
    And I click Login button
    Then welcome message is displayed in SecureArea page

    Scenario: Correct login
      Given I navigate to main page
      And I click on FormAuthentication link
      When I enter username "Pedro"
      And I enter password
      And I click Login button
      Then welcome message is displayed in SecureArea page
