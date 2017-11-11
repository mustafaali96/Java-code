//3.	Write a program that can create an array of 10 elements, fill the array randomly range (1-1000). Sort the array by using bubble sort then search any value in the array. The program must show the index number if the value is in the array or a message of value not found. (Read binary search from any book or from net)  //
import java.util.Scanner;
import java.lang.Math;
public class Searchvalue {
    public static void main(String[] args) {
        int a[];
        int b,i=0;
        a=new int[10];
        int temp=0;
        System.out.println("Array");
        for(int j=0;j<a.length;j++)
        {
            a[j]=(int)(Math.random()*1000);
        }
        for(int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);
        }
        boolean fixed=false;
        while(fixed==false)
        {
            fixed=true;
            for(int k=0;k<a.length-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    temp=a[k+1];
                    a[k+1]=a[k];
                    a[k]=temp;
                    fixed=false;
                }
            }
        }
        System.out.println("Bubble Sorted Array");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the value to be searched in the array:");
        Scanner input=new Scanner(System.in);
        b=input.nextInt();
        int first,last;
        first=0;
        last=i-1;
        int middle=(first+last)/2;
        while(first<=last)
        {
            if(a[middle]<b)
            {
                first=middle+1;
            }
            else if(a[middle]==b)
            {
                System.out.println(b+"is found at"+middle);
                break;
            }
            else
            {
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println("Value not found");
        }

    }
}
