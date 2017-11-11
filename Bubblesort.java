//1.	Write a program that can fill an array of 10 elements by randomly generated Integers, range (1-100). Sort the array by using bubble sort. //
import java.lang.Math;
public class Bubblesort {
    public static void main(String[] args) {
        int a[];
        a=new int[10];
        int temp;
        for(int i=0;i<10;i++)
        {
            a[i]=(int)(Math.random()*100);
        }
        System.out.println("Unsorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        boolean fixed=false;
        while(fixed==false)
        {
            fixed=true;
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                {
                 temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                    fixed=false;
                }
            }
        }
        System.out.println("Bubble Sorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
