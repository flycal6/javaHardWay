import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, inch, ft, fttoinch, totalinches, lb, bmi;

        System.out.print( "Your height (feet only) " );
        ft = keyboard.nextDouble();
        fttoinch = ft * 12;

        System.out.print( "Plus the inches: " );
        inch = keyboard.nextDouble();

        totalinches = fttoinch + inch;
        m = totalinches * 0.0254;

        System.out.print( "Your weight in lb: " );
        lb = keyboard.nextDouble();
        kg = lb * 0.453592;

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );
    }
}
