import java.util.Scanner;

public class scanTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner("This is a bunch of words");
    while(sc.hasNext()) {
      System.out.println(sc.next());
    }
  }
}
