//7.	Write a program that can take an Input as positive integer (call it Z) and displays the positive integers X and Y if the following Equation is satisfied by X and Y://
 //X^2  +  Y^2 = Z^2//

import java.util.Scanner;
public class Positiveintegers {
    public static void main(String args[])
    {
        int a,b,x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of x");
        x=input.nextInt();
        System.out.println("Eneter the value of y");
        y=input.nextInt();
        System.out.println("Enter the value of z");
        z=input.nextInt();
        a=Operator(x,y);
        b=Operator(z);
        if(a==b)
        System.out.println("The values of x and y that are satisfying the equation are "+x+" and "+y);
        else
            System.out.println("No X and Y exist");
    }



public static int Operator(int x, int y)
{
    int ans;
    ans=(x*x)+(y*y);
    return ans;
}
public static int Operator(int z)
{

    int ans;
    ans=(z*z);
    return ans;
}}