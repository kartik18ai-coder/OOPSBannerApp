ublic class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // 1. Define a String array with a size equal to the 7 lines of the banner 
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join()
        // Maintaining 7-line format with 9-character width per letter 
        lines[0] = String.join("", "  * ", "   * ", "  ** ", "   ** ");
        lines[1] = String.join("", " * * ", " * * ", " * * ", " ** ");
        lines[2] = String.join("", " * * ", " * * ", " * * ", "  ** ");
        lines[3] = String.join("", " * * ", " * * ", " ** ", "    ** ");
        lines[4] = String.join("", " * * ", " * * ", " * ", "       * ");
        lines[5] = String.join("", " * * ", " * * ", " * ", "      * ");
        lines[6] = String.join("", "  * ", "   * ", "  * ", "   *** ");

        // 3. Use an enhanced for-each loop to print each line [cite: 181, 186, 213]
        for (String line : lines) {
            System.out.println(line); 
        }
    }
}