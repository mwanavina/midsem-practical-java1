package question1;

public class Main {
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if (num % 3 == 0) return "Fizz";
        if (num % 5 == 0) return "Buzz";
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3)); // "Fizz"
        System.out.println(fizzBuzz(5)); // "Buzz"
        System.out.println(fizzBuzz(15)); // "FizzBuzz"
        System.out.println(fizzBuzz(4)); // "4"
    }

}
