//Write a program that inputs a hexadecimal number CONSISTING OF NOT MORE THAN 7 HEXADECIMAL DIGITS AND DISPLAYS IT'S VALUE IN DECIMAL 
import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        char HeXa[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Enter a hexadecimal number that you want to convert to decimal number of not more than 7 digits:");
        Scanner input = new Scanner(System.in);
        String Hex = input.nextLine();
        long ans = Hexatodecimal(HeXa, Hex);
        if (Hex.length() <= 7) {
            System.out.println("Hexadecimal input is : " + Hex + " It's decimal Equivalent is :" + ans);
        } else
            System.out.println("You Exceeded the limit");
    }


    public static long Hexatodecimal(char a[],String b)
    {
        long answer=0;
        double pow=0;
            for(int i=(b.length()-1);i>=0;i--)
            {
                char temp=b.charAt(i);
                for(int j=0;j<a.length;j++)
                {
                    if(temp==a[j])
                    {
                        answer=(long) (answer + j* (Math.pow(16, pow)));
                        pow++;
                    }
                }

            }
                    return answer;
    }


}

