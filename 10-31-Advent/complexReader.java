import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class complexReader {
  public static ArrayList<Integer> reader(String filename) {
    ArrayList<Integer>result = new ArrayList<Integer>();
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      
      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] nums = line.split("x");
        
        for (int i=0; i<nums.length; i++) {
          result.add(Integer.parseInt(nums[i]));
        }
      }

      input.close();
      return result;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return result;
    }
  }

  public static void main(String[] args) {
    System.out.println(reader("sepX.txt"));

    
  }
}
