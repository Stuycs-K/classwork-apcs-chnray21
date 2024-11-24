import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

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
      ArrayList<Integer>coord  = new ArrayList<Integer>(2);
      coord.add(0, 0);
      coord.add(1, 0);
      ArrayList<int[]>pastCoords = new ArrayList<int[]>();
      int coordNum = -1;

      for (int i =0; i<2; i++) {
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
        // for each coordinate passed, adds it to the pastCoords array
        // current coord is updated to the most recent pastCoords coordinate
        if (nsew == 1) {
          for (int j=0; j<forward; j++) {
            pastCoords.add(new int[] {coord.get(0), coord.get(1) + j});
            coordNum++;
          }
          coord.set(0, pastCoords.get(coordNum)[0]);
          coord.set(1, pastCoords.get(coordNum)[1]);
          result += forward;
        }
        else if (nsew == 2) {
          for (int j=0; j<forward; j++) {
            pastCoords.add(new int[] {coord.get(0) + j, coord.get(1)});
            coordNum++;
          }
          coord.set(0, pastCoords.get(coordNum)[0]);
          coord.set(1, pastCoords.get(coordNum)[1]);
          result += forward;
        }
        else if (nsew == 3) {
          for (int j=0; j<forward; j++) {
            pastCoords.add(new int[] {coord.get(0), coord.get(1) - j});
            coordNum++;
          }
          coord.set(0, pastCoords.get(coordNum)[0]);
          coord.set(1, pastCoords.get(coordNum)[1]);
          result -= forward;

        }
        else {
          for (int j=0; j<forward; j++) {
            pastCoords.add(new int[] {coord.get(0) - j, coord.get(1)});
            coordNum++;
          }
          coord.set(0, pastCoords.get(coordNum)[0]);
          coord.set(1, pastCoords.get(coordNum)[1]);
          result -= forward; 

        }
      }

      System.out.println(coordNum);
      for (int i=0; i<pastCoords.size(); i++) {
        System.out.println(pastCoords.get(i));
      }

      input.close();
      return Math.abs(result);
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isRepeat(ArrayList<Integer> coord, ArrayList<int[]> pastCoords) {
    for (int i=0; i<pastCoords.size(); i++) {
      if (coord.get(0) == pastCoords.get(i)[0] && coord.get(1)==pastCoords.get(i)[1]) {
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
