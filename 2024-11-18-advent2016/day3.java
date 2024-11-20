import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class day3 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      String result = "";

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] splitLine = line.split("-");
        System.out.println(Arrays.toString(splitLine));
      }

      input.close();
      return result;
    }
    catch (FileNotFoundException ex){ 
      System.out.println("File not found");
      return "invalid";
    }
  }

  public static void main(String[] args) {
    System.out.println(fxn("inputDay3.txt"));
  }
}
