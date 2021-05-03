package service.fizzbuzz;

public class FizzBuzz {

    public Object playWithNumber(int num) {
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";

        return num;
    }
}
