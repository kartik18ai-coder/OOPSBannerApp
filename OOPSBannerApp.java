// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class OOPSBannerApp {
   public OOPSBannerApp() {
   }

   public static String[] getOPattern() {
      return new String[]{"  *  ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *  "};
   }

   public static String[] getPPattern() {
      return new String[]{" **  ", " * * ", " * * ", " **  ", " **    ", " **    ", " **    "};
   }

   public static String[] getSPattern() {
      return new String[]{"  **  ", "**      ", " **     ", "   **   ", "     ** ", "    **  ", " **   "};
   }

   public static void main(String[] var0) {
      String[] var1 = getOPattern();
      String[] var2 = getPPattern();
      String[] var3 = getSPattern();

      for(int var4 = 0; var4 < var1.length; ++var4) {
         System.out.println(" " + var1[var4] + " " + var1[var4] + "  " + var2[var4] + " " + var3[var4]);
      }

   }
}
