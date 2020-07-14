Feature: Search
    Agile Story: As a user, I should be able to search when I am on Google search page

  Scenario: Google default title verification
    Given User is on the google search page
    Then User should see title is Google


  Scenario: Google title verification after search
    Given User is on the google search page
    When User searches apple
    Then User should see apple in the title




  Scenario: Google title verification after search
    Given User is on the google search page
    When User searches "peach"
    Then User should see "peach" in the title

  @wip
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News