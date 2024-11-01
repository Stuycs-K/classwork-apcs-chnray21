import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class scanTest {
  public static void main(String[] args) {
    // Scanner sc = new Scanner("This is a bunch of words");
    // while(sc.hasNext()) {
    //   System.out.println(sc.next());
    // }
    // Scanner sc1 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    // double sum = 0;
    // while(sc1.hasNext()){
    //   sum+=sc1.nextDouble();
    // }
    // System.out.println(sum);

    // Print every other line
    // try {
    //   File file = new File("scanTest.java");//1
    //   //CODE THAT SCANS THE FILE.
    //   Scanner input = new Scanner(file); 
    //   int lineNum = 0;
    //   while (input.hasNextLine()) {
    //     if (lineNum%2==0) {
    //       System.out.println(input.nextLine());
    //       lineNum++;
    //     }
    //     else {
    //       input.nextLine();
    //       System.out.println(" ");
    //       lineNum++;
    //     }
    //   }
    //   input.close();//releases the file from your program

    // } catch (FileNotFoundException ex) {
    //   //File not found what should you do?
    //   System.out.println("File not found");
    //   return; //you can return from a void function just don't put a value.
    // }

    // Print only lines that contain a '{'
    try {
      File file = new File("scanTest.java");//1
      //CODE THAT SCANS THE FILE.
      Scanner input = new Scanner(file); 
      String str;

      while (input.hasNextLine()) {
        str = input.nextLine();
        if (str.contains("{")) {
          System.out.println(str);          
        }
      }

      input.close();//releases the file from your program
    } 

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
