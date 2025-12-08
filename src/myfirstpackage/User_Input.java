package myfirstpackage;
import java.sql.SQLOutput;
import java.util.Scanner;

public class User_Input {
    public static void main ( String[] args)
    {
        System.out.println(" Taking input from the user !");
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number 1");
       //int a = sc.nextInt();
       Float a = sc.nextFloat();
        System.out.println(" enter number 2 ");
        //int b = sc.nextInt();
        Float b = sc.nextFloat();
       // int sum = a + b;
        Float sum = a + b;
        System.out.println(" the sum of these number is ");
        System.out.println(sum);
       // boolean b1 = sc.hasNextInt();
       // System.out.println(b1);


    }

}
