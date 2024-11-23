import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

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
        if (nsewTemp.equals("R")) {
          nsew++;
        }
        else {
          nsew--;
        }

        // change nsew to fit the the range of values from 1 to 4 
        // if it is not there
        if (nsew < 1) {
          nsew = 4;
        }
        else if (nsew > 4) {
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
      return Math.abs(result);
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }
  
  public static int firstPlaceTwice(String filename) {
    try {
      // needs the same things as distance, 
      // but create a coordinate array [x, y] to keep track of the coordinates you are at
      // make a 2D array to keep track of every coordinate passed
      // create another method isBetween to check if a coordinate you have passed before
      // is between current coordinate and the last coordinate

      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);
      String[] directions = input.nextLine().split(", ");
      // Split each "travel command" into individual elements in an array

      int nsew = 1;
      // 1 = north, 2 = east, 3 = south, 4 = west
      int result = 0;
      int[] coord  = new int[] {0, 0};
      int[][] pastCoords = new int[10000000][2];

      for (int i =0; i<directions.length; i++) {
        // get the direction and how much to travel forwards
        String nsewTemp = directions[i].substring(0, 1);
        int forward = Integer.parseInt(directions[i].substring(1));

        // +1 or -1 to nsew depending on if direction is R or L
        if (nsewTemp.equals("R")) {
          nsew++;
        }
        else {
          nsew--;
        }

        // change nsew to fit the the range of values from 1 to 4 
        // if it is not there
        if (nsew < 1) {
          nsew = 4;
        }
        else if (nsew > 4) {
          nsew = 1;
        }

        // change direction and log in past coordinates
        if (nsew == 1) {
          for (int j=0; j<forward; i++) {

          }
          result += forward;
        }
        else if (nsew == 2) {
          result += forward;

        }
        else if (nsew == 3) {
          result -= forward;

        }
        else {
          result -= forward;

        }
      }

      input.close();
      return Math.abs(result);
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isRepeat(int[] coord, int[][] pastCoords) {
    for (int i=0; i<pastCoords.length; i++) {
      if (Arrays.equals(coord, pastCoords[i])) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    // System.out.println(distance("inputDay1.txt"));
    System.out.println(firstPlaceTwice("inputDay1.txt"));
  }
}
