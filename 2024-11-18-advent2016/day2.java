import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day2 {
  public static int fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      return 1;

    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }

  }

  public static void main(String[] args) {
    System.out.println(fxn("inputDay2.txt"));
  }
}
