import java.io.*;
class Names {


    public static void main(String arg[]) {
    String first = "ana";
    String middle = "kim";
    String last = "xen";
    String initials;
    String firstInit, middleInit, lastInit;

    firstInit = first.substring(0,1);
    middleInit = middle.substring(0,1);
    lastInit = last.substring(0,1);
    initials = firstInit.concat(middleInit);
    initials = initials.concat(lastInit);

    System.out.println();
    System.out.println(first + " " + middle + " " + last + " ");
    System.out.println(initials);
    System.out.println(last + ", " + first + " " + middle);
    System.out.println(last + ", " + first + " " + middleInit +".");
   // System.out.println(first.toUpperCase() + " " + lasttoUpperCase());
    System.out.println(first + " equals ana is " + first.equals("ana"));
    System.out.println(first + " equals ana (ignoring case) is "  + first.equalsIgnoreCase("ana"));
    System.out.println("The character at index 3 in " + middle + " is " +middle.substring(3,1));
    System.out.println("The index of \"gerald\" within " + middle + " is " +    
     middle.indexOf("gerald"));
    System.out.println("The index of \"gerald\" within " + last + " is " +last.indexOf("gerald"));
    System.out.println();

}
}
