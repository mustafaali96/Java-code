import java.util.Scanner;
import java.util.*;

class array{
public static void BinarySearching(int first; int last; int middle;)
int c,n;
array[c];
{
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();

    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}



class BinarySearch{
public static void main(String[] args){
array OBJ=new array();
OBJ.BinarySearching(int c; int first; int last; int middle; int n; int search; int array[]);
}
  }