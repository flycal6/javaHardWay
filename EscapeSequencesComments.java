public class EscapeSequencesComments {
    public static void main( String[] args ) {
        // This exercise demonstrates escape sequences and comments (like these)!
        System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
        System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
        // System.out.frimp( "Learn Java the Hard Way" );
        System.out.print( "Hello\n" ); // prints Hello.
        System.out.print( "Jello\by\n" ); // prints Jelly.
        /*The quick brown fox jumped over a lazy dog.
          Quick wafting zephyrs vex bold Jim. */
        System.out /* testing */ .println( "Hard to believe, eh?" );
        System.out.println( "Suprised? /* abcde */ Or what did you expect?" );
        System.out.println( "\\// -=- \\//" );
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
        System.out.print( "I hope you understand \"escape sequences\" now.\n" );
        // and comments. :)
    }
}
// a block comment in the middle of println produces a compiler error
