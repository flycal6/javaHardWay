import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int math;

        out.println( "Welcome to UC Davis College Admissions Interface!" );
        out.print( "Please enter your SAT math score (200-800): " );
        math = keyboard.nextInt();

        out.print( "Admittance status: " );

        if ( math >= 790 )
            out.print( "CERTAIN " );
        else if ( math >= 390 ) // placed for SD #2
            out.print( "UNLIKELY " ); // placed for SD #2
        else if ( math >= 710 )
            out.print( "SAFE " );
        else if ( math >= 580 )
            out.print( "PROBABLE " );
        else if ( math >= 500)
            out.print( "UNCERTAIN " );
        else //below 390
            out.print( "DENIED " );
        out.println();
    }
}
