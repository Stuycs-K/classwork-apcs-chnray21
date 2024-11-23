import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      
      String result = "";

      for (int i=0; i<8; i++) {
        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the column
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char letter = line.charAt(i);
          alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
        } 
        
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

  }
}
