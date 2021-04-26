package demo;

public class FizzBuzzGame {

    public String[] play() {
        String[] response = new String[10];
        for(int i=0;i<10;i++){
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
