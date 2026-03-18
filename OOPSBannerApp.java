public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Define and initialize the String array in a single statement
        String[] lines = {
            String.join("", "  * ", "   * ", "  ** ", "   ** "),
            String.join("", " * * ", " * * ", " * * ", " ** "),
            String.join("", " * * ", " * * ", " * * ", "  ** "),
            String.join("", " * * ", " * * ", " ** ", "    ** "),
            String.join("", " * * ", " * * ", " * ", "       * "),
            String.join("", " * * ", " * * ", " * ", "      * "),
            String.join("", "  * ", "   * ", "  * ", "   *** ")
        };

        // Use a for-each loop to print each line of the banner 
        //
        for (String line : lines) {
            System.out.println(line); 
        }
    }
}
