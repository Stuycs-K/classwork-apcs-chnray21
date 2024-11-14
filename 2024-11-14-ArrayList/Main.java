import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(100000));


    ArrayList<String> test = ArrayListPractice.createRandomArray(10);
    ArrayListPractice.replaceEmpty(test);
    System.out.println(test);
  }
}
