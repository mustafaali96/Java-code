
public class Maxrun {

	public static void main(String[] args) {
		String a=new String("1223344555555");
		int maxrun[]=new int[a.length()];
		System.out.println(a);
		for(int i=0;i<a.length();i++)
		{
			char temp=a.charAt(i);
			maxrun[i]=check(temp,a);
		}
		maxrun(maxrun);
	}
public static int check(char t,String b)
{
	int count=0;
	for(int i=0;i<b.length();i++)
	{
		char temp=b.charAt(i);
		if(t==temp)
		{
			count++;
		}
	}
	return count;
}
public static void maxrun(int mr[])
{
	int max=mr[0];
	for(int i=1;i<mr.length;i++)
	{
		if(mr[i]>max)
			max=mr[i];
	}
	System.out.println("The Max Run Is :"+max);
}
	
}
