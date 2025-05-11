import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final int month = 12;
        final int present = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double Rate = scanner.nextDouble();

        System.out.print("Period (years): ");
        int year = scanner.nextInt();

        double mRate = Rate/present/month;
        int numberofpayment = year * month;
        double mortgage = principle*(mRate*Math.pow(1+mRate,numberofpayment))/(Math.pow(1+mRate,numberofpayment)-1);

        String out = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+out);





    }
}