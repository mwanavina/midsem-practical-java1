package question9;

import java.util.Arrays;

public class Main {

    public static void zeroesToEnd(int[] arr) {
        // Index to place the next non-zero element
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the rest of the array with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 0, 4, 0, 5};
        int[] arr2 = {0, 0, 2, 0, 5};
        int[] arr3 = {4, 4, 5};
        int[] arr4 = {0, 0};

        zeroesToEnd(arr1);
        zeroesToEnd(arr2);
        zeroesToEnd(arr3);
        zeroesToEnd(arr4);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
