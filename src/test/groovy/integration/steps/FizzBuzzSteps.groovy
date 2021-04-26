package integration.steps

import demo.FizzBuzzGame
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class FizzBuzzSteps {

    def upperBound
    def result
    def fizzBuzzGame

    @Given("I'm logged in to Fizz-Buzz Game")
    public void iMLoggedInToFizzBuzzGame() {
        //login code
    }

    @And("I start a fresh game with an upper bound of {int}")
    public void iStartAFreshGameWithAnUpperBoundOf(int upperBoundInt) {
        fizzBuzzGame = new FizzBuzzGame()
        upperBound = upperBoundInt
    }

    @And("I start a fresh game")
    public void iStartAFreshGame() {
        fizzBuzzGame = new FizzBuzzGame()
    }

    @When("I play the Fizz-Buzz game")
    public void i_play_the_fizz_buzz_game() {
        // Write code here that turns the phrase above into concrete actions
        //result = fizzBuzzGame.play(upperBound)
        //
        result = fizzBuzzGame.play()
    }

    @Then("output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz")
    public void outputAnArrayWithMultiplesOfAreFizzAndMultiplesOfAreBuzz() {
        assert result != null
        assert result == ['1','2','Fizz','4','Buzz','Fizz','7','8','Fizz','Buzz']
    }

}
