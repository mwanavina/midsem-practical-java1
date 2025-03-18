package question10;

public class Main {

    public static boolean isSafeBridge(String bridge) {
        // Check if the bridge contains any spaces using contains object
        return !bridge.contains(" ");
    }

    public static void main(String[] args) {
        System.out.println(isSafeBridge("####"));
        System.out.println(isSafeBridge("## ####"));
        System.out.println(isSafeBridge("#"));
        System.out.println(isSafeBridge("### ####"));
        System.out.println(isSafeBridge("#####"));
    }
}

