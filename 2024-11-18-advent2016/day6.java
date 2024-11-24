import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day6 {
  public static String fxn(String filename) {
    try {
      String result = "";

      for (int i=0; i<8; i++) {
        File myFile = new File(filename);
        Scanner input = new Scanner(myFile);
      
        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the column
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char letter = line.charAt(i);
          alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
        } 
        
        input.close();


        int index = 0; // records the index of the highest frequency letter
        int value = 0; // records the value of the highest frequency
        // for loop to find the index of the most frequent letter
        for (int j=0; j<alpha.length-1; j++) {
          if (alpha[j] > value) {
            index = j;
            value = alpha[j];
          }
        }

        // add the most frequent letter to result
        char letter = (char)('a'+index);
        result+=letter;

      }

      System.out.println(" ");
      return result;
    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "invalid";
    }
  }

  public static String fxn2(String filename) {
    try {
      String result = "";

      for (int i=0; i<8; i++) {
        File myFile = new File(filename);
        Scanner input = new Scanner(myFile);
      
        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the column
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char letter = line.charAt(i);
          alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
        } 
        
        input.close();

        int index = 0; // records the index of the lowest frequency letter
        int value = 1000; // records the value of the lowest frequency
        // for loop to find the index of the least frequent letter
        for (int j=0; j<alpha.length; j++) {
          if (alpha[j] < value) {
            index = j;
            value = alpha[j];
          }
        }

        // add the most frequent letter to result
        char letter = (char)('a'+index);
        result+=letter;

      }

      System.out.println(" ");
      return result;
    }

    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "invalid";
    }
  }
  public static void main(String[] args) {
    // System.out.println(fxn("inputDay6.txt"));
    System.out.println(fxn2("inputDay6.txt"));
  }
}
