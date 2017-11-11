//9.	Write a program that inputs a decimal integer and displays its value in hexadecimal. 

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        char HeXa[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter an integer which you want to convert into hexadecimal:");
        Scanner input = new Scanner(System.in);
        String Hex=new String();
        int a = input.nextInt();
        if (a == 0) {
            System.out.println("The Decimal Input is : " + a + " It's Hexadecimal Equivalent is : " + a);
        } else {
            System.out.println("The Decimal Input is :" + a + "It's Hexadecimal Equivalent is :" + Decimaltohexa(HeXa, Hex, a));
        }
    }

    public static String Decimaltohexa(char a[], String b, int num) {
        int temp = num;
        int rem;
            while (temp > 0) {
                rem = temp % 16;
                b = a[rem] - b;
                temp = temp / 16;
            }
            return b;
        }
    }
