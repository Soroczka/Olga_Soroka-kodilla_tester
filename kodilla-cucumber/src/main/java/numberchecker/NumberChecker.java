package numberchecker;

import java.time.MonthDay;

public class NumberChecker {
    public static String checkIfDivisible(int number){
        if (number % 3 == 0 && number % 5 != 0){
            return "Fizz";
        } else if (number % 5 == 0 && number % 3 != 0){
            return "Buzz";
        } else if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        return "Nope";
    }
}
