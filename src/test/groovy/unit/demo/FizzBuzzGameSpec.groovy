package unit.demo

import demo.FizzBuzzGame
import spock.lang.Specification

class FizzBuzzGameSpec extends Specification{

    def fizzBuzzGame = new FizzBuzzGame()

/*    Given the number "1"
    When we run the number through fizzbuzz
    Then we should get back "1"*/
    def 'Get the number itself when the input is neither a multiple of 3 nor 5'(){
        when: 'play with the number'
            def output = fizzBuzzGame.playWithNumber(num)
        then: 'output the number itself'
            output == num as String
        where: 'input integers that are neither multiples of 3 nor 5'
            num << [1,2,4,7,8,11]
    }

    def 'Get Fizz when a multiple of 3 is provided'(){
        when: 'play with the number'
            def output = fizzBuzzGame.playWithNumber(num)
        then: 'output Fizz'
            output == 'Fizz'
        where: 'input integers that are multiples of 3'
            num << [3,6]
    }

    def 'Get Buzz when a multiple of 5 is provided'(){
        when: 'play with the number'
            def output = fizzBuzzGame.playWithNumber(num)
        then: 'output Buzz'
            output == 'Buzz'
        where: 'input integers that are multiples of 5'
            num << [5,10]
    }


}
