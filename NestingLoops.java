public class NestingLoops {
    public static void main( String[] args ) {
        // this is #1 = I'll call it "CN"
        for (int n=1; n <= 3; n++) {
            for (char c='A'; c <= 'E'; c++) {
                System.out.println( c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a=1; a <= 3; a++) {
            for (int b=1; b <= 3; b++) {
                System.out.print("(" + a + "," + b + ")");
            }
            // * You will add a line of code here.
            System.out.println("Inner loop end.");
        }

        System.out.println("\n");
    }
}
// SD #1  The inner var changes faster, 3 times for each outer loop change
// SD #2  The letters now cycle through A-E before the int iterates.
//          Total lines of output is unchanged
// SD #3  The AB loop now prints each number pair on it's own line
<<<<<<< HEAD
// SD #4  The println get printed once the inner loop condition is no longer true.  
=======
// SD #4  The println get printed once the inner loop condition is no longer true
>>>>>>> 283d51bcf40ff52c9f5668afe0301a0acc456371
