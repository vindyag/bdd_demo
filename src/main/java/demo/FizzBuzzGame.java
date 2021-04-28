package demo;

import java.io.IOException;

import demo.helper.ConfigurationLoader;

public class FizzBuzzGame {

    public String[] play() throws IOException {
        Integer upperLimit = ConfigurationLoader.getUpperLimit();
        String[] response = new String[upperLimit];
        for(int i=0;i<upperLimit;i++){
            response[i] = playWithNumber(i+1);
        }
        return response;
    }

    public String playWithNumber(int num) {
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }
}
