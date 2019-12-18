Feature: Simple Search

  Scenario Outline: Searching for an artifact by artifact ID
    Given Javaan is on the search page
    When he searches for "<artifact>"
    Then the following artifacts should be proposed:
      | <artifact>
    Examples:
      | artifact          |
      | serenity-core     |
      | serenity-cucumber |
      | serenity-junit |
