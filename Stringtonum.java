//11.	Write a program that can take two 5 digits numbers input as String at rum time. Convert the two numbers in numeric form and show the result of their addition. For example: first number is "12345" and second is "56789". Convert these 2 in numbers, add them and print the result.
import java.lang.*;
import java.util.Scanner;

public class Stringtonum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first string");
        String First=input.nextLine();
        System.out.println("Enter Second string");
        String Second=input.nextLine();
        int fir=Convert(First);
        int sec=Convert(Second);
        int ans=total(fir,sec);
        System.out.println("Total="+ans);
    }
    public static int Convert(String b)
    {
        int a=Integer.parseInt(b);
        return a;
    }
    public static int total(int a,int b)
    {
        return a+b;
    }
}
