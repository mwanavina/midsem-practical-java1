package question3;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 2, 67, 34, 89, 23};
        //Identify the logical mistake in the code.
        // >> int max =0; did not initialise any of the array numbers
        // >> correction: initialise with the first element of the array
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
    }
}
