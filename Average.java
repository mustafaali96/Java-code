import java.lang.Math;
public class Average {

	public static void main(String[] args) {
		int a[]=new int[4];
		double avgt=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int) ((Math.random()*25)+10);
			System.out.println(a[i]);
		avgt=avgt+a[i];
		}
		System.out.println("The Average Temprature Of 4 Cities : "+(avgt/4));
	}

}
