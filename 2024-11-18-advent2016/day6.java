import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      
      String result = "";

      for (int i=0; i<1; i++) {
        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the column
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char letter = line.charAt(i);
          alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
        } 
        
        int index = 0; // records the index of the highest frequency letter
        int value = 0; // records the value of the highest frequency
        // for loop to find the index of the most frequent letter
        for (int j=0; j<alpha.length-1; j++) {
          if (alpha[j] > value) {
            index = j;
            value = alpha[j];
          }
        }

        System.out.println(index);
        System.out.println(value);
        // add the most frequent letter to result

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
