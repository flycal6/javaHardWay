import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class CaesarCipher {
    /**
     * Returns the character shifted by the given number of letters.
     */
    public static char shiftLetter(char c, int n) {
        int u = c;

        if (! Character.isLetter(c) || Character.isWhitespace(c))
            return c;

        u = u + n;
        if (Character.isUpperCase(c) && u > 'Z'
         || Character.isLowerCase(c) && u > 'z') {
              u -= 26;
        }
        if (Character.isUpperCase(c) && u < 'A'
         || Character.isLowerCase(c) && u < 'a') {
            u += 26;
        }

        return (char)u;
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String plaintext, cipher = "", iFile = "plaintext.txt", oFile = "cipher.txt";
        Scanner fileReader = new Scanner(new File(iFile));
        int shift;

        System.out.print("Shift (0-26): ");
        shift = keyboard.nextInt();

        while (fileReader.hasNext()) {
            String w = fileReader.next();
                for (int i = 0; i < w.length(); i++)
                    cipher += shiftLetter(w.charAt(i), shift);
        }

        // System.out.print("Message: ");
        // plaintext = keyboard.nextLine();
        // System.out.print("Shift (0-26): ");
        // shift = keyboard.nextInt();

        // for (int i=0; i<plaintext.length(); i++) {
        //     cipher += shiftLetter(plaintext.charAt(i), shift);
        // }
        System.out.println("creating cipher file...");
        PrintWriter out = new PrintWriter("cipher.txt");
            out.println(cipher);
        out.close();
    }
}
// This accomplishes the study drill, but the cipher text omits spaces.  Line 12 doesn't work like
// I think it should
