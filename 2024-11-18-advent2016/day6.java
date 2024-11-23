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
        // loop through and get the index of the most common letter
        int index = 0;
        int max = 0;
        for (int j=0; j<26;j++) {
          if (alpha[j] > max) {
            max = alpha[j];
            index = j;
          }
        }
        char frequentLetter = (char)('a'+index);
        result+=frequentLetter;
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
    System.out.println(fxn("inputDay6.txt"));
  }
}
