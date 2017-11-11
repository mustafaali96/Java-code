class Gates
{
public static void main(String args[])
{
boolean a=true;
boolean b=false;
boolean c,d,e,f,g;
c=a|b;
System.out.println("a+b="+c);
d=!a;
System.out.println("!a="+d);
e=!b;
System.out.println("!b="+e);
f=d|e;
System.out.println("d|e="+f);
g=f^c;
System.out.println("Answer="+g);
}
}