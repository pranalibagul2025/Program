package PQDate4122025;

public class ReverseNumber {
    public static void main (String[] agrs)
    {
        int num = 772081;
        int rev = 0;
        while (num != 0)
        {
            int digit =num %10;
            rev =rev * 10 + digit;
           num =num / 10;
        }
        {
            System.out.println("Reverse Numberv = "+ rev);
        }

    }
}

