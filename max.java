class max
{
public static void main(String arg[])
{
int a=0;
int b[]=new int[5];
for (int i=0;i<5;i++)
b[i]=(int)(Math.random()*100);
int c=(int)Math.max(a,b[i]);
System.out.println("Max. number is"+c);
}
}
