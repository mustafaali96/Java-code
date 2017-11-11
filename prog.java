class prog    
{
public static void main(String arg[])
{
int no=Integer.parseInt(arg[0]);
int a;
while(no>0)
{
a=no%10;
System.out.print(a);
no=no/10;
}
}
}