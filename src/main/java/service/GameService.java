package service;

import service.fizzbuzz.FizzBuzz;

public class GameService {

    public Object[] play() {
        int arraySize = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[] result = new Object[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = fizzBuzz.playWithNumber(i + 1);
        }
        return result;
    }
}

