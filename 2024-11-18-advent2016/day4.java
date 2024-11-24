import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class day4 {
  public static int fxn(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      int result = 0;

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] splitLine = line.split("-");
        // splits lines by dashes so that the last element of the array is the sector ID and checksum

        int[] alpha = new int[26];
        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        // add in values of each letter in the alphabet for the line
        // goes through the line and adds 1 to the value of each letter for each time it appears
        for (int i=0; i<splitLine.length-1; i++) {
          for (int j=0; j<splitLine[i].length(); j++) {
            char letter = splitLine[i].charAt(j);
            alpha[letter - 'a'] = alpha[letter - 'a'] + 1;
          }
        }

        String[] record = new String[5];
        // find the indexes of the largest 5 numbers, record their corresponding letters in record
        for (int i=0; i<5; i++) {
          int index = 0; // records the index of the highest frequency letter
          int value = 0; // records the value of the highest frequency
          // for loop to find the index of the most frequent letter
          for (int j=0; j<alpha.length; j++) {
            if (alpha[j] > value) {
              index = j;
              value = alpha[j];
            }
          }
          record[i] = alphabet[index];
          alpha[index] = -1;
        }

        String finalRecord = "";
        for (int i=0; i<record.length; i++) {
          finalRecord+=record[i];
        }
        System.out.println(finalRecord);

        System.out.println(finalRecord.equals(splitLine[splitLine.length-1].substring(4, 9)));
        if (finalRecord.equals(splitLine[splitLine.length-1].substring(4, 9))) {
          result+=Integer.parseInt(splitLine[splitLine.length-1].substring(0, 3));
        }
      }

      input.close();
      return result;
    }
    catch (FileNotFoundException ex){
      System.out.println("File not found");
      return -1;
    }
  }

  public static void fxn2(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] splitLine = line.split("-");
        // splits lines by dashes so that the last element of the array is the sector ID and checksum

        int shiftNum = Integer.parseInt(splitLine[splitLine.length-1].substring(0, 3));
        String result = "";

        for (int i=0; i<splitLine.length-1; i++) {
          for (int j=0; j<splitLine[i].length(); j++) {
            if (splitLine[i].charAt(j)+ shiftNum%26 > 'z') {
              result += (char)('a'+(splitLine[i].charAt(j)+(shiftNum%26) - 'z'));
            }
            else {
              result += (char)(splitLine[i].charAt(j)+(shiftNum%26));
            }
          }
          result+="-";
        }

        System.out.println(result+shiftNum);
      }

      input.close();
    }
    catch (FileNotFoundException ex){
      System.out.println("File not found");
    }
  }

  public static void main(String[] args) {
    //System.out.println(fxn("inputDay4.txt"));
    fxn2("inputDay4.txt");
  }
}
