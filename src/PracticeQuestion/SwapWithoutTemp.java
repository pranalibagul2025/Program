package PracticeQuestion;

public class SwapWithoutTemp {
    public static void main(String[]args)
    {
        int a=20;
        int b=10;
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("after Swap:");
        System.out.println(" a="+a);
        System.out.println(" b="+b);
    }
}
