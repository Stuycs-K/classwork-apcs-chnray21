import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

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

        ArrayList<String>frequentLetter = new ArrayList<String>();
        ArrayList<Integer>frequency = new ArrayList<Integer>();
        // the indexes of these two lists will correspond to one another;
        // e.g. if J is at frequentLetter[i], its frequency equals frequency[i]

        for (int i=0; i<splitLine.length -1; i++) {
          for (int j=0; j<splitLine[i].length(); j++) {
            // check if frequentLetter contains the letter already
            // if yes, add 1 to the corresponding value in frequency
            // if no, add the letter to frequentLetter and set the value to 1

            if (frequentLetter.contains(splitLine[i].substring(j, j+1))) {
              int index = frequentLetter.indexOf(splitLine[i].substring(j, j+1));
              frequency.set(index, frequency.get(index)+1);
            }
            else {
              frequentLetter.add(splitLine[i].substring(j, j+1));
              frequency.add(1);
            }
          }
        }
        // after this is done, will have arrays frequentLetter and frequency
        // containing all letters and their corresponding frequencies

        System.out.println(frequentLetter);
        System.out.println(frequency);

        String final5 = "";
        // loop through frequency, finding the highest 5 numbers and their corresponding letters
        for (int i=0; i<6; i++) {

        }
      }

      input.close();
      return result;
    }
    catch (FileNotFoundException ex){
      System.out.println("File not found");
      return "invalid";
    }
  }

  // public static int findLargest(ArrayList<Integer>nums) {
  //   int value = 0;
  //   for (int i=0; i<nums.size(); i++) {
  //     if (nums.get(i) > value) {
  //       value = nums.get(i);
  //     }
  //   }
  // }

  public static void main(String[] args) {
    System.out.println(fxn("inputDay4.txt"));
  }
}
