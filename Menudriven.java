import java.util.Scanner;
class MenuDriven{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.println("***Menu****\t\n");
System.out.println("Select One option");
System.out.println("1. Even or Odd number");
System.out.println("2. Prime number");


int a=in.nextInt();
switch(a){
case 1:

System.out.println("Enter any number");

int num=in.nextInt();
if(num%2==0){
System.out.println("It is Even number");
}
else
{
System.out.println("It is Odd number");
}
break;

case 2:
int p;
boolean isPrime= true;

System.out.println("Enter any number");
int number=in.nextInt();
for(int i=2;i<=number/2;i++){
p=number%i;
if(p==0){
isPrime=false;
break;
}
}
if(isPrime)
System.out.println(number+ " is a prime number");
else
System.out.println(number+ " is a not a prime number");
}
}
}
