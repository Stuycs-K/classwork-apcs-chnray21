public class Driver {
  public static void makeBorder(int color) {
    System.out.println(Text.CLEAR_SCREEN);
    System.out.println(Text.HIDE_CURSOR);

    for (int i=1; i<81; i++) {
      Text.color(Text.background(color));
      Text.go(0, i);
      System.out.println("~");
    }

    for (int i=2; i<31; i++) {
      Text.color(Text.background(color));
      Text.go(i, 80);
      System.out.println("~");
    }

    for (int i=1; i<80; i++) {
      Text.color(Text.background(color));
      Text.go(29, i);
      System.out.print("~");
    }

    for (int i=1; i<29; i++) {
      Text.color(Text.background(color));
      Text.go(i, 0);
      System.out.println("~");
    }
    
    System.out.println(Text.RESET);
    
  }

  public static void main(String[] args) {
    makeBorder(Text.BLUE);

  }
}