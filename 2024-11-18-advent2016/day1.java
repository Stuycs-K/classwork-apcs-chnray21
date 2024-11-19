import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day1 {
  public static int distance(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      String[] direction = input.nextLine().split(", ");
      for (int i =0; i<direction.length; i++) {
        System.out.println(direction[i]);
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
