package integration.demo.steps

import demo.FizzBuzzGame
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class FizzBuzzSteps {

    def result
    def fizzBuzzGame

    @Given("I am logged in")
    public void iMLoggedInToFizzBuzzGame() {
        //login code would go here. not going to implement
    }

    @And("I start a fresh game")
    public void iStartAFreshGame() {
        fizzBuzzGame = new FizzBuzzGame()
    }

    @When("I play the Fizz-Buzz game")
    public void iPlayTheFizzBuzzGame() {
        result = fizzBuzzGame.play()
    }

    @Then("output an integer array with multiples of 3 are Fizz and multiples of 5 are Buzz")
    public void outputAnArrayWithMultiplesOfAreFizzAndMultiplesOfAreBuzz() {
        assert result != null
        assert result == ['1','2','Fizz','4','Buzz','Fizz','7','8','Fizz','Buzz']
    }

}
