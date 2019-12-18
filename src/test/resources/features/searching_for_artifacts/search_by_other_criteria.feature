Feature: Search by other criteria

  Scenario: Searching for an artifact by group ID
    Given Javaan is on the search page
    When he searches for "serenity-bdd"
    Then the following artifacts should be proposed:
      | serenity-archetypes |
      | serenity-cucumber   |
      | serenity-screenplay |

  Scenario: Searching for a group id that does not exist
    Given Javaan is on the search page
    When he searches for "does-not-exist"
    Then the result list should be empty