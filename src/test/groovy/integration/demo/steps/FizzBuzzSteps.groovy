package integration.demo.steps

import demo.GameService
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class FizzBuzzSteps {

    def result
    def fizzBuzzGame

    @Given("the user is logged in")
    void theUserIsLoggedIn() {
        //login code would go here. not going to implement
    }

    @And("start a fresh game")
    void startAFreshGame() {
        fizzBuzzGame = new GameService()
    }

    @When("user plays")
    void userPlays() {
        result = fizzBuzzGame.play()
    }

    @Then("output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz")
    void outputAnArrayWithMultiplesOfAreFizzAndMultiplesOfAreBuzz() {
        assert result != null
        assert result == ['1','2','Fizz','4','Buzz','Fizz','7','8','Fizz','Buzz']
    }

}
