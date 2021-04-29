package demo;

import java.io.IOException;

import demo.fizzbuzz.FizzBuzz;
import demo.helper.ConfigurationLoader;

public class GameService {

    public String[] play() throws IOException {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Integer upperLimit = ConfigurationLoader.getUpperLimit();
        String[] response = new String[upperLimit];
        for (int i = 0; i < upperLimit; i++) {
            response[i] = fizzBuzz.playWithNumber(i + 1);
        }
        return response;
    }

}
