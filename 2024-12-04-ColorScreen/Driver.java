public class Driver {
  public static void makeBorder(int color) {
    System.out.println(Text.CLEAR_SCREEN);
    System.out.println(Text.HIDE_CURSOR);

    for (int i=0; i<80; i++) {
      Text.color(Text.background(color));
      Text.go(0, i);
      System.out.println("~");
    }

    System.out.println(Text.RESET);
  }

  public static void main(String[] args) {
    makeBorder(Text.BLUE);
  }
}
