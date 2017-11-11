//2.	Write a program that can fill an array of 10 elements by randomly generates Integers, range (1-100). Find the Minimum and Maximum values without sorting the array.  //

import java.lang.Math;
public class Minmax {
    public static void main(String[] args) {
        int a[];
        a=new int[10];
        int min=0,max=0;
        System.out.println("ARRAY");
        min=a[0];
        max=a[0];
        for(int i=0;i<a.length;i++)
        {
            a[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        min=a[0];
        max=a[0];
        for(int i=0;i<a.length;i++)
        {
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        System.out.println("Minimum Value="+min);
        System.out.println("Maximum Value="+max);
    }

}
