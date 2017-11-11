class Marks1
{
public static void main(String args[])
{
int scores[]={42,53,60,88,92};
int a,avg=0,b=0,c,d,e,f=0,g;

for(a=0;a<=4;a++)
{
System.out.println(scores[a]);
b=b+scores[a];
}
avg=b/5;
System.out.println("Average="+avg);
c=Math.max(scores[0],Math.max(scores[1],Math.max(scores[2],Math.max(scores[3],scores[4]))));
System.out.println("Highest Score="+c);
d=Math.min(scores[0],Math.min(scores[1],Math.min(scores[2],Math.min(scores[3],scores[4]))));
System.out.println("Lowest Score="+d);
for(e=0;e<5;e++)
{
if(scores[e]>=avg)
{
System.out.println(scores[e]);
f=f+1;
}
}
System.out.println("number of students exceeding the average="+f);
}}

