Feature: Fizz-Buzz

  Scenario: User plays Fizz-Buzz
    Given the user is logged in
    And start a fresh game
    When user plays
    Then output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz

