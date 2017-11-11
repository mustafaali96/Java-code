import java.util.Scanner;
class Str
{
public static void main (String[]args)
{
Scanner in=new Scanner (System.in);
String str=in.next();
char ch[]=str.toCharArray();
if(ch[0]==ch[ch.length-1] && ch[1]==ch[ch.length-2]){
System.out.println("\nTrue");}
else System.out.println("\nFalse");
}
}