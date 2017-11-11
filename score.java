class score
{
public static void main(String arg[])
{
int sum=0;
int a[]=new int[5];
for(int b=0;b<5;b++);
{
a[b]=(int)(Math.random()*100);
System.out.println(""+a[b]);
sum+=a[b];
System.out.println("Sum is" +sum); 
}
int avg=sum/5;
System.out.println("average is" +avg);
int d=0;
int b[]=new int[5];
for (int i=0;i<5;i++)
b[i]=(int)(Math.random()*100);
int c=(int)Math.max(d,b[i]);
System.out.println("Max. number is"+c);
}
}
