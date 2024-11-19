import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day3 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      String result = "";

      input.close();
      return result;
    }
    catch (FileNotFoundException ex){ 
      System.out.println("File not found");
      return "invalid";
    }
  }
}
