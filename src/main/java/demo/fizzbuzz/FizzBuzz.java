package demo.fizzbuzz;

public class FizzBuzz {

    public String playWithNumber(int num) {
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }
}
