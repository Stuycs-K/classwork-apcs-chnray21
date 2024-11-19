import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day2 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      // if up, subtract 3
      // if right, add 1
      // if down, add 3
      // if left, subtract 1

      String result = "";
      int value = 5;

      while (input.hasNextLine()) {
        String command = input.nextLine();

        for (int i=0; i<command.length(); i++) {
          if (command.substring(i, i+1).equals("U")) {
            value=value-3;
          }
          else if (command.substring(i, i+1).equals("R")) {
            value=value+1;
          }
          else if (command.substring(i, i+1).equals("D")) {
            value=value+3;
          }
          else if (command.substring(i, i+1).equals("L")) {
            value=value-1;
          }
        }

        result+=value;
      }

      input.close();
      return result;
    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "invalid";
    }

  }

  public static void main(String[] args) {
    System.out.println(fxn("inputDay2.txt"));
  }
}
