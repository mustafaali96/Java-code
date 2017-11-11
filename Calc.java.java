import java.util.Scanner;
class Calc
{
public static void main (String args[])
{
Scanner in=new Scanner (System.in);
int num1,num2; char op;
System.out.println("Calculator\n");
System.out.print("Enter first value\t"); num1=in.nextInt();
System.out.print("Enter second value\t"); num2=in.nextInt();
System.out.print("Enter operator\t\t"); op=in.next(".").charAt(0);
System.out.print("\n");
switch(op)
{
case'+': System.out.println(num1+" "+op+" "+num2+" = "+(num1+num2));
		break;
case'-': System.out.println(num1+" "+op+" "+num2+" = "+(num1-num2));
		break;
case'*': System.out.println(num1+" "+op+" "+num2+" = "+(num1*num2));
		break;
case'/': if(num2==0) System.out.println(num1+" "+op+" "+num2+" = "+"Infinity");
else System.out.println(num1+" "+op+" "+num2+" = "+(num1/num2));
		break;
default: System.out.println("Unknown operator");
		break;
}
System.out.print("\n");
}
}