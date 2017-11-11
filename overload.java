class overload
{
public static void main (String[] args)
{
overloaddemo ob=new overloaddemo();
double result;
ob.test();
ob.test(10);
ob.test(10,20);
result=ob.test(123.25);
System.out.println ("Result of 123.25= "+result);
}
}
