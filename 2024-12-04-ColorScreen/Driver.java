public class Driver {
  public static void makeBorder(int color) {
    System.out.print(Text.HIDE_CURSOR);

    // make the frame

    for (int i=1; i<81; i++) {
      Text.background(color);
      Text.go(0, i);
      System.out.print("~");
    }

    // for (int i=2; i<31; i++) {
    //   Text.background(color);
    //   Text.go(i, 80);
    //   System.out.println("~");
    // }

    // for (int i=1; i<80; i++) {
    //   Text.background(color);
    //   Text.go(29, i);
    //   System.out.print("~");
    // }

    // for (int i=1; i<29; i++) {
    //   Text.background(color);
    //   Text.go(i, 0);
    //   System.out.print("~");
    // }
    
    // make the numbers
    // int[] nums = createRandomArray(3);

    // for (int i=1; i<4; i++) {
    //   if (nums[i-1] < 25 ) {
    //     Text.go(1, i+(20*i));
    //     Text.color(Text.RED, Text.BRIGHT);
    //     System.out.print(nums[i-1]);
    //   }
    //   else if (nums[i-1] > 75) {
    //     Text.go(1, i+(20*i));
    //     Text.color(Text.GREEN, Text.BRIGHT);
    //     System.out.print(nums[i-1]);
    //   }
    //   else {
    //     Text.go(1, i+(20*i));
    //     Text.color(Text.WHITE);
    //     System.out.print(nums[i-1]);
    //   }
    // }

   //  Text.go(31, 0);
    System.out.print(Text.SHOW_CURSOR);
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
    makeBorder(Text.RED);
  }
}
