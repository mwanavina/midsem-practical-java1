package question2;

public class EvenSumCalculator {
        public static void main(String[] args) {
            int sum = 0;

            for (int i = 1; i <= 10; i++) {
                // Identify the logical mistake in the code.
                // >> i% 2= 1; was the issue, as it was not correct condition for even numbers
                // >> correction: i %2 =0;
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of even numbers from 1 to 10 is: " + sum);
        }
}