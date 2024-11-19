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
          if (command.substring(i, i+1).equals("U") && value != 1 && value != 2 && value != 3) {
            // need to make sure keypad is not at 1, 2, or 3 to move up
            value=value-3;
          }
          else if (command.substring(i, i+1).equals("R") && value != 3 && value != 6 && value != 9) {
            // make sure keypad is not at 3, 6, or 9 to move right
            value=value+1;
          }
          else if (command.substring(i, i+1).equals("D") && value != 7 && value != 8 && value != 9) {
            // make sure keypad is not at 7, 8, or 9 to move down
            value=value+3;
          }
          else if (command.substring(i, i+1).equals("L") && value != 1 && value != 4 && value != 7) {
            // make sure keypad is not at 1, 4, or 7 to move left
            value=value-1;
          }
        }

        result+=value;
        value = 5;
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
