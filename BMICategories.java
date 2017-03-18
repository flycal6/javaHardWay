import java.util.Scanner;

public class BMICategories {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double bmi, inches, lbs, m, kg;

        System.out.print( "Enter your height in inches: " );
        inches = keyboard.nextDouble();

        System.out.print( "Enter your weight in lbs: " );
        lbs = keyboard.nextDouble();

        m = inches * 0.0254;
        kg = lbs * 0.453592;
        bmi = kg / (m*m);

        System.out.println( "Your BMI is: " + bmi );

        System.out.print( "BMI category: " );
        if ( bmi < 15 ) {
            System.out.println ( "very severely underweight" );
        }
        else if ( bmi <=16 ) {
            System.out.println( "severely underweight" );
        }
        else if ( bmi < 18.5 ) {
            System.out.println( "underweight" );
        }
        else if ( bmi < 25 ) {
            System.out.println( "normal weight" );
        }
        else if ( bmi < 30 ) {
            System.out.println( "overweight" );
        }
        else if ( bmi < 35 ) {
            System.out.println( "moderately obese" );
        }
        else if ( bmi < 40 ) {
            System.out.println( "severely obese" );
        }
        else {
            System.out.println( "very severely/\"morbidly\" obese" );
        }
    }
}
