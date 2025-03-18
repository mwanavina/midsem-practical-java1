package question7;

public class Main {
    public static int count(int number) {
        // Convert the number to positive if it's negative
        number = Math.abs(number);

        if (number == 0) return 1;

        // Count digits until 10
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // results
        System.out.println(count(318));
        System.out.println(count(-92563));
        System.out.println(count(4666));
        System.out.println(count(-314890));
        System.out.println(count(654321));
        System.out.println(count(638476));
    }
}

