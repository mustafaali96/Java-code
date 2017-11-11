//4.	Write a Java application called SumMinMax.java that takes exactly four integers and determines and prints the smallest, the largest and the sum of these four integers. The program’s output should look like the following://

public class Summinmax{
    public static void main(String[] args) {
        Four First=new Four(10,20,15,23);
        int a=First.Smallest();
        int b=First.Largest();
        int c=First.total();
        System.out.println("First Number is"+First.a);
        System.out.println("Second Number is"+First.b);
        System.out.println("Third Number is"+First.c);
        System.out.println("Fourth Number is "+First.d);
        System.out.println("The smallest integer was"+a+"and the largest integer was"+b);
        System.out.println("The sum of these four integers is"+c);
    }

}


