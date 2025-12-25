package PQ24122025;

public class MerryChristmas {

    public static void main(String[] args) {

        // Tree leaves
        int spaces = 14;
        int stars = 1;

        for (int i = 0; i < 9; i++) {
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Tree trunk
        for (int i = 0; i < 3; i++) {
            System.out.println("             ||");
        }

        // Tree base
        System.out.println("            \\=====/");
    }
}
