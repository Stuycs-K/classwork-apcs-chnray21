import java.util.Scanner;

public class scanTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner("This is a bunch of words");
    while(sc.hasNext()) {
      System.out.println(sc.next());
    }
    Scanner sc1 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    double sum = 0;
    while(sc1.hasNext()){
      sum+=sc1.nextDouble();
    }
    System.out.println(sum);
  }
}
