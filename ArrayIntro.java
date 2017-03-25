public class ArrayIntro {
    public static void main( String[] args ) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                            "Neptune"};
        String[] states = {"Alabama", "California", "Michigan", "Idaho", "Texas", "Mississippi"};

        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }

        System.out.println();

        for (String s : states) {
            System.out.println(s + "\n" + s.toUpperCase() + "\n");
        }
    }
}
