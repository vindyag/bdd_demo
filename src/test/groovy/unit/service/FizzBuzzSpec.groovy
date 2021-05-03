package unit.service

import service.fizzbuzz.FizzBuzz
import spock.lang.Specification

class FizzBuzzSpec extends Specification {

    def fizzBuzz = new FizzBuzz()

    def "Output Fizz when a multiple of 3 is provided"() {
        when: 'play Fizz-Buzz with a number'
            def output = fizzBuzz.playWithNumber(num)
        then: 'output Fizz'
            assert output == "Fizz"
        where: 'a number which is a multiple of 3'
            num << [3, 6, 9]
    }

    def "Output Buzz when a multiple of 5 is provided"() {
        when: 'play Fizz-Buzz with a number'
            def output = fizzBuzz.playWithNumber(num)
        then: 'output Buzz'
            assert output == "Buzz"
        where: 'a number which is a multiple of 5'
            num << [5, 10]
    }

    def "Output the number itself when its neither a multiple of 3 nor 5"() {
        when: 'play Fizz-Buzz with a number'
            def output = fizzBuzz.playWithNumber(num)
        then: 'output the number itself'
            assert output == num
        where: 'a number which is neither a multiple of 3 nor 5'
            num << [1, 2, 4, 7, 8]
    }
}
