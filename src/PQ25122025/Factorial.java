package PQ25122025;

public class Factorial {

        static int factorial(int n) {
            if (n == 0 || n == 1) {   // base case
                return 1;
            }
            return n * factorial(n - 1); // recursive call
        }

        public static void main(String[] args) {
            int num = 5;
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
    }


