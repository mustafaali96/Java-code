import javax.swing.*;
class A{
private int[]arr1={0,1,2};
private int[]arr2={2,1,2};
public int[] getArr1(){
return arr1;}
public int []getArr2(){
return arr2;}
}
class B extends A{
private int[]arr3={1,3,2};
String str="", nstr;
public String Add(){
int[]res=new int[3];
int[]Val1=getArr1();
for(int a=0;a<Val1.length;a++){
res[a]=arr3[a]+Val1[a];
nstr=""+res[a];
str=str+nstr;
}
return str;
}
public String Sub(){
String str1="",nstr1;
int []res2=new int[3];
int []Val2=getArr2();
for(int i=0;i<Val2.length;i++)
{
res2[i]=arr3[i]-Val2[i];
nstr1=""+res2[i];
str1=str1+nstr1;
}
return str1;
}
public void Display(){
String a=Add();
String b=Sub();
String str="",nstr;
JOptionPane.showMessageDialog(null,"After Addition="+a+"\n"+"After Subtraction="+b);
}
public void Largest(){
int arr1[]=getArr1();
int arr2[]=getArr2();
int larg=0,larg1=0,large;
for(int k=0;k<arr1.length;k++){
for(int j=1;j<arr2.length;j++){
if (arr1[k]>arr1[j]){
larg=arr1[k];
}
if (arr2[k]>arr2[j]){
larg1=arr2[k];}
}}}
if (larg>larg1){
large=larg;
}
else
{
large=larg1;
}
JOptionPane.showMessageDialog(null,"Largest Element of Two Array="+larg);
}
public class Else{
public static void main(String[] args){
B obj=new B();
obj.Add();
obj.Sub();
obj.Display();
obj.Largest();
}
} 