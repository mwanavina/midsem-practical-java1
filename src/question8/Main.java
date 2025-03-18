package question8;

public class Main {
    public static int animals(int chickens, int cows, int pigs) {
        // Calculate total number of legs
        int totalLegs = (chickens * 2) + (cows * 4) + (pigs * 4);
        return totalLegs;
    }

    public static void main(String[] args) {
        // results
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
    }
}

