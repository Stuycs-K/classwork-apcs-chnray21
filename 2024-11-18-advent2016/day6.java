import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      
      String result = "";

      input.close();
      return result;
    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "invalid";
    }
  }

  public static void main(String[] args) {

  }
}
