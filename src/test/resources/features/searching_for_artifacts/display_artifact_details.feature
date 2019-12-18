Feature: Display artifact details

  Scenario: Displaying artifact details
    Given Javaan has searched for "serenity-core"
    When he selects the version number
    Then the artifact details for serenity-core should be displayed

  Scenario: Displaying groups
    Given Javaan has searched for "serenity-core"
    When he selects the group id
    Then all the artifacts for the "net.serenity-bdd" group should be displayed
