import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        double gal, ppg = 2.65, ftot;

        System.out.println("Gas is $" + ppg);
        System.out.print("How many gallons do you want? ");
        gal = kb.nextDouble();
        ftot = gal * ppg;

        System.out.println("Total cost is $" + ftot);
        System.out.println("Printing receipt... done.");

        PrintWriter fileout = new PrintWriter("receipt.txt");

        fileout.println("+------------------------------+");
        fileout.println("                              ");
        fileout.println("         CORNER STORE            ");
        fileout.println();
        fileout.println("     2014-06-25  04:38PM         ");
        fileout.println();
        fileout.println("     GALLONS:       $ " + gal);
        fileout.println("     Price/gallon:  $ " + ppg);
        fileout.println();
        fileout.println("     Fuel total:    $ " + ftot);
        fileout.println();
        fileout.println("+------------------------------+");
        fileout.close();
    }
}
