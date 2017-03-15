public class CreatingVariables {
    public static void main( String[] args ) {
        int x, y, age, eyes;
        double seconds, e, checking, dollarsInMyPocket;
        String firstName, lastName, title, dog, cat;

        x = 10;
        y = 400;
        age = 39;
        eyes = 3;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;
        dollarsInMyPocket = 444.444;

        firstName = "Graham";
        lastName = "Mitchell";
        title = "Mr.";
        dog = "good pupper";
        cat = "warm ball of fur";

        System.out.println( "The variable x contains " + x );
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );
        System.out.println( "My dog is a " + dog + " but has " + eyes + " eyes." );
        System.out.println( "My cat is a " + cat + " and cost $" + dollarsInMyPocket);
    }
}
