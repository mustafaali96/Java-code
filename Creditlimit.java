//13.	(Credit Limit Calculator) Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account. 

public class Creditlimit {
    public static void main(String[] args) {
        int creditlimit = 7000;
        int one = Startbalance(7000);
        int two = totalofitems(2000);
        int three = creditsapplied(1000);
        System.out.println("Credit Limit Calculator");
        System.out.println("Account Number   :   " + Accountnum(012));
        System.out.println("Balance At The Start of the month   :   " + one);
        System.out.println("Total Of All Items Charged  :   " + two);
        System.out.println("Total Of All Credits Applied    :   " + three);
        System.out.println("Allowed Credit Limit    :    " + creditlimit);
        int four = newbalance(one, two, three);
        if (four <= creditlimit) {
            System.out.println("New Balance     :    " + four);
        } else {
            System.out.println("Credit Limit exceeded ");
        }
    }

    public static int Accountnum(int a) {

        return a;
    }

    public static int Startbalance(int a) {

        return a;
    }

    public static int totalofitems(int a) {

        return a;
    }

    public static int creditsapplied(int a) {

        return a;
    }

    public static int newbalance(int a, int b, int c) {
        return a + b - c;
    }

}