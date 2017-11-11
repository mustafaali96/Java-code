//12.	Write a program to calculate your age taking date of birth and current date.  
//The output should be something like this 

//You were born on January 2, 2000 
//Today is November 18, 2000 
//You are now 321 days old.    


class Dateofbirth{
public static int calcAge(int curMonth, int curDay, int curYear,int birthMonth,int   birthDay,int birthYear) {

  int yearDif = curYear - birthYear;
  int age = 8;
  if(curMonth < birthMonth) {
     age = yearDif - 1;
     }
  if(curMonth == birthMonth) {
     if(curDay < birthDay) {
        age = yearDif - 1;
        }
     if(curDay >= birthDay) {
        age = yearDif;
        }
     }
  if(curMonth > birthMonth) {
     age = yearDif;
     }

  return age;
  }

public static void main(String args[])
{
	Age Man=new Age();
	System.out.println(Man.calcAge(10, 5, 2016, 1, 17, 1998)+" YEARS OLD");
	
}
}