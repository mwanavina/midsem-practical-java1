package question6;

public class Main{
    public static boolean isPlural(String word) {
        if (word == null || word.isEmpty()) {
            //for empty and null strings
            return false;
        }
        return word.endsWith("s");
    }

    public static void main(String[] args) {
        // results
        System.out.println(isPlural("changes"));
        System.out.println(isPlural("change"));
        System.out.println(isPlural("dudes"));
        System.out.println(isPlural("magic"));
    }
}

