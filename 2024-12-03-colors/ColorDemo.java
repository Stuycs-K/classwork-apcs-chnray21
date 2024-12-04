public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void printRgbText(int r, int g, int b) {
    System.out.print("\u001b[38;2;"+r+";"+g+";"+b+"m");
  }
  public static void printRgbBackground(int r, int g, int b) {
    System.out.print("\u001b[48;2;"+r+";"+g+";"+b+"m");
  }

  public static void resetText() {
    System.out.print("\u001b[0m");
  }

  public static void resetBackground() {
    System.out.print("\u001b[49m");
  }


  // ---------------------------------------------
  public static void main(String[] args) {
    // printRgbText(0, 109, 209);
    // printRgbBackground(255, 255, 255);
    // System.out.println("Hello World");
    // resetText();
    // resetBackground();

    // for (int i=30; i<38; i++) {
    //   System.out.println("\u001b[" + i + "m");
    //   System.out.println("Rainbow!");
    // }

    // strobe lights
    // for (int num=0; num<100000; num++) {
    //   for (int i=40; i<48; i++) {
    //     System.out.println("\u001b[" + i + "m");
    //     for (int j=0; j<1; j++) {
    //       System.out.println();
    //     }
    //   }
    // }

    // checkerboard (or vertical stripes, depending on the terminal")
    for (int i=0; i<1000; i++) {
      System.out.print("\u001b[" + 40 + "m");
      System.out.print(" ");
      System.out.print("\u001b[" + 47 + "m");
      System.out.print(" ");
    }
  }
}
