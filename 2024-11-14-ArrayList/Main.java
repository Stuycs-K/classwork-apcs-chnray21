import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    // createRandomArray() tests
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(100000));

    // replaceEmpty() tests
    // ArrayList<String> test = ArrayListPractice.createRandomArray(100000);
    // ArrayListPractice.replaceEmpty(test);
    // System.out.println(test);

    // makeReversedList tests
    ArrayList<String> tester = ArrayListPractice.createRandomArray(5);
    System.out.println(tester);
    System.out.println(ArrayListPractice.makeReversedList(tester));
  }
}
