package PQ25122025;

public class ReverseString {
    static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0); // recursive call
    }

    public static void main(String[] args) {
        String input = "java";
        System.out.println("Reversed string: " + reverse(input));
    }
}
