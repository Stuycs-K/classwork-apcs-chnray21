import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      int num = 0;

      while (input.hasNextLine()) {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a+b>c && a+c>b && c+b>a) {
          num++;
        }
      }
      input.close();
      return num;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
