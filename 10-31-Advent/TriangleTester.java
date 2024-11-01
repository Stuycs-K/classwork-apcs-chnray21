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

  public static int countTrianglesB(String filename) {
    try {
      File myFile = new File(filename);
      Scanner input = new Scanner(myFile);

      int num = 0;

      while (input.hasNextLine()) {
        int a = input.nextInt();
        input.nextLine();
        int b = input.nextInt();
        input.nextLine();
        int c = input.nextInt();
        input.nextLine();
        if (a+b>c && a+c>b && c+b>a) {
          num++;
        }
      }

      Scanner input2 = new Scanner(myFile);
      while (input2.hasNextLine()) {
        input2.nextInt();
        int a = input2.nextInt();
        input2.nextLine();
        input2.nextInt();
        int b = input2.nextInt();
        input2.nextLine();
        input2.nextInt();
        int c = input2.nextInt();
        input2.nextLine();
        if (a+b>c && a+c>b && c+b>a) {
          num++;
        }
      }

      input.close();
      input2.close();
      return num;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static void main(String[] args) {
    // System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
}
