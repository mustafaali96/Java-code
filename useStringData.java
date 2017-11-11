import javax.swing.*;
class StringData{
private String str;
StringData(String nstr){
str=nstr;
}
public void CheckString(){
char ch;
boolean res=true;
int numeric=1;
for(int i=0;i<str.length();++i)
{
ch=str.charAt(i);
res=Character.isDigit(ch);
if(res!=true){
numeric=0;
break;
}
}
if(numeric==1)
JOptionPane.showMessageDialog(null,"String is numeric");
else
JOptionPane.showMessageDialog(null,"String is not numeric");
}
}
class useStringData{
public static void main(String[]args){
String str="1245";
StringData obj=new StringData(str);
obj.CheckString();
}}


