package mypackage;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = Sc.nextInt();
        if(num % 2 == 0 )
        {
            System.out.println("enter a EvenNumber");
        }else{
            System.out.println("enter a OddNumber");
        }
    }
}

