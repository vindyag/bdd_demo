package integration.demo.steps

import demo.GameService
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class FizzBuzzSteps {

    def result
    def fizzBuzzGame

    @Given("I am logged in")
    void iMLoggedInToFizzBuzzGame() {
        //login code would go here. not going to implement
    }

    @And("I start a fresh game")
    void iStartAFreshGame() {
        fizzBuzzGame = new GameService()
    }

    @When("I play the Fizz-Buzz game")
    void iPlayTheFizzBuzzGame() {
        result = fizzBuzzGame.play()
    }

    @Then("output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz")
    void outputAnArrayWithMultiplesOfAreFizzAndMultiplesOfAreBuzz() {
        assert result != null
        assert result == ['1','2','Fizz','4','Buzz','Fizz','7','8','Fizz','Buzz']
    }

}
