package demo

import spock.lang.Specification

class FizzBuzzSpec extends Specification{

    def "Return Fizz if the number is a multiple of 3"(){
        given: 'the number'
            def fizzBuzz = new FizzBuzz()
        when: 'play the game with number'
            def card = fizzBuzz.play(number)
        then: 'return Fizz'
            assert card == 'Fizz'
        where:
            number << [3,6]
    }
}
