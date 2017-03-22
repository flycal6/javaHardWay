public class ThereAndBackAgain {
    public static void main( String[] args ) {
        System.out.println("Here.");
        erebor(); // SD #1 removing the parens give compiler error 'not a statement'
        System.out.println("Back first time.");
        // erebor();
        System.out.println("Back second time.");
    }

    public static void erebor() {
        System.out.println("There");
    }
}
