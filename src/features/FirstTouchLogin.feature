Feature: Login to first touch

  Scenario: verify login succesfull
    Given user opens firsttouch login page
    Then user enters loginid
    Then user enters password
    And user clicks on signIn
    And verify login succesfull
    And close browser
