public class OOPSBannerApp {

    // UC7: Static Inner Class for Encapsulation
    private static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define patterns for O, P, and S
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            "  **** ",
            " * ",
            "  *** ",
            "     * ",
            " **** "
        });

        // Store them in an array to represent "OOPS"
        CharacterPatternMap[] bannerOrder = {charO, charO, charP, charS};

        // Display the banner horizontally
        printBanner(bannerOrder);
    }

    private static void printBanner(CharacterPatternMap[] bannerOrder) {
        // Assuming all characters have 5 rows for this UC
        for (int i = 0; i < 5; i++) {
            StringBuilder row = new StringBuilder();
            for (CharacterPatternMap cp : bannerOrder) {
                row.append(cp.getPattern()[i]).append("  "); // 2 spaces between letters
            }
            System.out.println(row.toString());
        }
    }
}