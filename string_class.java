public class string_class
{
public static void main (String [] args)
{
StringBuffer s1=new StringBuffer("ABC");
StringBuffer s2=new StringBuffer();
StringBuffer s3=new StringBuffer(50);
System.out.println("s1= "+s1);
System.out.println("s1.length()="+s1.length());
System.out.println("s1.capacity()="+s1.capacity());
System.out.println("s2.length()="+s2.length());
System.out.println("s1.capacity()="+s2.capacity());
System.out.println("s3.capacity()="+s3.capacity());

System.out.println("**\nAppend**");
System.out.println("Capacity of S2="+s2.capacity());
System.out.println("Length of S2="+s2.length());
s2.append("ABCDEF");
System.out.println(s2);
System.out.println("Capacity of S2="+s2.capacity());
System.out.println("Length of S2="+s2.length());
s2.append("Q");
}
}
