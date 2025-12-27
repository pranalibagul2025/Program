package PQ25122025;

public class PrintRecursive {
    static void printrecursive (int n)
    {
        if (n == 0)
        {
            return;
        }
        System.out.println(n);
        printrecursive(n - 1);
    }
    public static void main (String[] args)
    {
        int n = 5;
        printrecursive(n);
    }
}
