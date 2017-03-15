import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args ) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello.  What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh?  That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print( "Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( "and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );

        String study;
        System.out.print( "How long did this exercise take you? " );
        study = keyboard.next();
        System.out.println( "It took you " + study + ", huh?" );
    }
}
// integers do not blow up Double variables.  My guess is because 1 is equal to 1.0, or the same
// number of bits are used to store ints and doubles

// numbers do not blow up String vars because numbers can be stored as strings

// I couldn't find anything to type to blow up the first question with the String var.  Maybe if I
// could type in arabic or something.  The 2nd will blow up with any not numeric character.  The 3rd
 // and 4th will blow up the same as the second.
