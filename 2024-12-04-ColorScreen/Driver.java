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
      Text.go(30, i);
      System.out.print("~");
    }

    for (int i=1; i<30; i++) {
      Text.color(Text.background(color));
      Text.go(i, 0);
      System.out.println("~");
    }

    Text.color(Text.background(Text.BLACK));
    int[] nums = createRandomArray(3);
    for (int i=1; i<4; i++) {
      if (nums[i-1] < 25 ) {
        Text.go(2, i+(20*i));
        Text.color(Text.BRIGHT, Text.RED);
        System.out.print(nums[i-1]);
      }
      else if (nums[i-1] > 75) {
        Text.go(2, i+(20*i));
        Text.color(Text.BRIGHT, Text.GREEN);
        System.out.print(nums[i-1]);
      }
      else {
        Text.go(2, i+(20*i));
        Text.color(Text.WHITE);
        System.out.print(nums[i-1]);
      }
    }

    for (int i=2; i<80; i++) {
      Text.go(3, i);
      Text.color(color);
      System.out.print("=");
    }

    Text.color(Text.ITALICS, Text.WHITE);
    Text.go(14, 15);
    System.out.print("In hoc enim fallimur, quod mortem prospicimus;");
    Text.go(15, 15);
    System.out.println("magna pars eius iam praeterit.");
    Text.go(16, 30);
    System.out.print("Quicquid aetatis retro est, mors tenet.");
    Text.go(31, 0);
    
    System.out.println(Text.RESET);
    
  }

  public static int[] createRandomArray(int size) {
    int[] result = new int[size];
    for (int i = 0; i<size; i++) {
      int num = (int)(100*Math.random());
      result[i] = num;
    }
    return result;
  }

  public static void main(String[] args) {
    makeBorder(Text.BLUE);

  }
}