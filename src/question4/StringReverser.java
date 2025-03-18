package question4;

public class StringReverser {
    public static void main(String[] args) {
        String str = "HELLO";
        String reversed = "";

        //Identify the logical mistake in the code.
        //>> error: the initialisation, condition, update was wrong
        // >> correction
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
