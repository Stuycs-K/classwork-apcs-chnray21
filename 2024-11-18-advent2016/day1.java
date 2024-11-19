import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class day1 {
  public static int distance(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      String[] directions = input.nextLine().split(", ");
      // Split each "travel command" into individual elements in an array

      int nsew = 1;
      // 1 = north, 2 = east, 3 = south, 4 = west
      int result = 0;

      for (int i =0; i<directions.length; i++) {
        // get the direction and how much to travel forwards
        String nsewTemp = directions[i].substring(0, 1);
        int forward = Integer.parseInt(directions[i].substring(1));

        // +1 or -1 to nsew depending on if direction is R or L
        if (nsewTemp == "R") {
          nsew++;
        }
        else {
          nsew--;
        }

        // change nsew to fit the the range of values from 1 to 4 
        // if it is not there
        if (nsew == 0) {
          nsew = 4;
        }
        else if (nsew == 5) {
          nsew = 1;
        }

        if (nsew == 1 || nsew == 2) {
          result+=forward;
        }
        else if (nsew == 3 || nsew == 4) {
          result-=forward;
        }
      }

      input.close();
      return result;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }  

  public static void main(String[] args) {
    System.out.println(distance("inputDay1.txt"));
  }
}
