import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      
      String result = "";

      for (int i=0; i<3; i++) {
        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the column
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char letter = line.charAt(i);
          System.out.println(letter);
          alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
        } 
        System.out.println("end of this loop");
      }

      input.close();
      System.out.println(" ");
      return result;
    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "invalid";
    }
  }

  public static void main(String[] args) {
    System.out.println(fxn("inputDay6.txt"));
  }
}
