class sorting
{
  public static void main(String args[])
  {
     int semester[]=new int[5];
     int rollno[]=new int[5];
     String name[]=new String[5];
     float gpa[]=new float[5];

     int a,b=0, temp;
     float x;
     String z;
    
     for(a=0;a<=4;a++)
     {
       name[a]=args[b];
       b++;
       semester[a]=Integer.parseInt(args[b]);
       b++;
       rollno[a]=Integer.parseInt(args[b]);
       b++;
       gpa[a]=Float.parseFloat(args[b]);
       b++;
     }
       for(a=0;a<4;a++)
       {
         for(b=a+1;b<=4;b++)
         {
          if(gpa[a]<gpa[b])
           {  
             z=name[a];
             name[a]=name[b];
             name[b]=z;
             
             temp=rollno[a];
             rollno[a]=rollno[b];
             rollno[b]=temp;
            
             temp=semester[a];
             semester[a]=semester[b];
             semester[b]=temp;
   
             x=gpa[a];
             gpa[a]=gpa[b];
             gpa[b]=x;
       }
          }
            }
          System.out.println("\nName\tRoll no\tSemester\tgpa");
          for(a=0;a<=4;a++)
          System.out.println(name[a]+"\t"+rollno[a]+"\t"+semester[a]+"\t\t"+gpa[a]);
} 
   }

