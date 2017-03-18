public class ClubBouncer {
    public static void main( String[] args ) {
        int age = 22;
        boolean onGuestList = false;
        double allure = 7.5;
        String gender = "F";

        if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
            System.out.println("You are allowed to enter the club.");
        }
        // The below line would break up the if/else block and fails to compile
        // System.out.println( "C-C-C Combo Breaker!" );
        else {
            System.out.println("You are not allowed to ender the club.");
        }
    }
}
