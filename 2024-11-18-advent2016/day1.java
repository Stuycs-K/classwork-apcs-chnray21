import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day1 {
  public static int distance(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      String[] directions = input.nextLine().split(", ");
      // Split each "travel command" into individual elements in an array

      int nsew = 1;
      // 1 = north, 2 = east, 3 = south, 4 = west

      for (int i =0; i<directions.length; i++) {
        // System.out.println(direction[i]);
        String nsewTemp = directions[i].substring(0, 1);
        int forward = Integer.parseInt(directions[i].substring(1));
        // get the direction and how much to travel forwards
        System.out.println(nsewTemp + ", " + forward);

        // add or subtract the value
      }

      int result = 0;

      input.close();
      return result;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }  

  public static void main(String[] args) {
    System.out.println(distance("inputDay1.txt"));
  }
}
