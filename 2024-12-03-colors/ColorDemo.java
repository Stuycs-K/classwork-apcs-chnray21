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

  public static void main(String[] args) {
    printRgbText(255, 0, 255);
    printRgbBackground(255, 255, 255);
    System.out.println("Hello World");
    resetText();
    resetBackground();
  }
}
