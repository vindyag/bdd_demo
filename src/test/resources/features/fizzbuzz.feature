Feature: Fizz-Buzz

  Scenario: User plays Fizz-Buzz with an upper bound
    Given I'm logged in to Fizz-Buzz Game
    And I start a fresh game
    When I play the Fizz-Buzz game
    Then output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz

