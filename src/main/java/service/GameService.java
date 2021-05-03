package service;

import java.io.IOException;

import service.fizzbuzz.FizzBuzz;
import service.helper.ConfigurationLoader;

public class GameService {

    public Object[] play() throws IOException {
        int arraySize = ConfigurationLoader.getUpperLimit();
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[] result = new Object[arraySize];
        for (int i = 0; i < arraySize; i++) {
            result[i] = fizzBuzz.playWithNumber(i + 1);
        }
        return result;
    }
}

