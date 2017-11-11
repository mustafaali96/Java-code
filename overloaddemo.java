class overloaddemo
{
void test ()
{
System.out.println ("No parameters");
}
void test (int a)
{
System.out.println ("a= "+a);
}
void test (int a , int b)
{
System.out.println ("a= "+a);
System.out.println ("b= "+b);
}
double test (double a)
{
System.out.println ("double a + "+a);
return a*a;
}
}
