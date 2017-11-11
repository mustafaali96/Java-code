package cardtester;

import java.util.*;

abstract class Card
{
  String recipient;
  public abstract void greeting();
}

class Holiday extends Card
{
  public Holiday( String r )
  {
    recipient = r;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Season's Greetings!\n\n");
  }
}

class Birthday extends Card
{
  int age;

  public Birthday ( String r, int years )
  {
    recipient = r;
    age = years;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Happy " + age + "th Birthday\n\n");
  }
}

class Valentine extends Card
{
  int kisses;

  public Valentine ( String r, int k )
  {
    recipient = r;
    kisses    = k;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Happy Valentine Day\n");
   
  }
}

public class CardTester
{
  public static void main ( String[] args )
  {
    String me;
    Scanner input = new Scanner( System.in );
    System.out.print("Your name: ");
    me = input.next();

    Holiday   hol = new Holiday( me );
    hol.greeting();

    Birthday  bd  = new Birthday( me, 21 );
    bd.greeting();

    Valentine val = new Valentine( me, 7 );
    val.greeting();

  }
}