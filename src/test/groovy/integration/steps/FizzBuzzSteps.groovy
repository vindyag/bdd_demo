package integration.steps

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import service.GameService

class FizzBuzzSteps {
    def gameService
    def result

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // login code go here
    }
    @Given("start a fresh game")
    public void start_a_fresh_game() {
        gameService = new GameService()
    }
    @When("user plays")
    public void user_plays() {
        result = gameService.play()
    }
    @Then("output a positive integer array of size {int}")
    public void output_a_positive_integer_array_of_size(Integer arraySize) {
        assert result != null
        assert result.length == arraySize
    }
    @Then("its’ multiples of 3 are Fizz and multiples of 5 are Buzz")
    public void its_multiples_of_3_are_fizz_and_multiples_of_5_are_buzz() {
        assert result == [1,2,'Fizz',4,'Buzz','Fizz',7,8,'Fizz','Buzz']
    }
}
