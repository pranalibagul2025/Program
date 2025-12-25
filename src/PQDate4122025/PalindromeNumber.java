package PQDate4122025;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();


        int original = num;
        int revesrse  = 0;

        while (num != 0)
        {
            int digit =num %10;
            revesrse = revesrse * 10 + digit;
            num =num / 10;
        }
        if(original == revesrse)
        {
            System.out.println(original+ " is a PalindromeNumber.");
        }
        else
        {
            System.out.println(original+ " is not a PalindromeNumber.");
        }
        sc.close();

    }
}
