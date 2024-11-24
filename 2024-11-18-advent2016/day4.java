import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day4 {
  public static String fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      String result = "";

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] splitLine = line.split("-");
        // splits lines by dashes so that the last element of the array is the sector ID and checksum

        int[] alpha = new int[26];
        // add in values of each letter in the alphabet for the line
        // goes through the line and adds 1 to the value of each letter for each time it appears
        for (int i=0; i<splitLine.length-2; i++) {
          for (int j=0; j<splitLine[i].length(); j++) {
            char letter = splitLine[i].charAt(j);
            alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
          }
        }

        String record = "";
        // find the indexes of the largest numbers
        int index = 0; // records the index of the highest frequency letter
        int value = 0; // records the value of the highest frequency
        // for loop to find the index of the most frequent letter
        for (int j=0; j<alpha.length-1; j++) {
          if (alpha[j] > value) {
            index = j;
            value = alpha[j];
          }
        }
        record += 'a'+index;
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
    System.out.println(fxn("inputDay4.txt"));
  }
}
