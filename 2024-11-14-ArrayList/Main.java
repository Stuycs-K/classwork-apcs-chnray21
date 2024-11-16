import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // createRandomArray() tests
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(25));
    // System.out.println(ArrayListPractice.createRandomArray(50));
    // System.out.println(ArrayListPractice.createRandomArray(100));
    // System.out.println(ArrayListPractice.createRandomArray(100000));

    // replaceEmpty() tests
    // ArrayList<String>smallTest = ArrayListPractice.createRandomArray(25);
    // ArrayList<String> bigTest = ArrayListPractice.createRandomArray(200000);
    // ArrayListPractice.replaceEmpty(smallTest);

    // ArrayListPractice.replaceEmpty(bigTest);
    // // System.out.println(smallTest);
    // System.out.println(bigTest);

    // makeReversedList tests
    // ArrayList<String>tester = ArrayListPractice.createRandomArray(5);
    // ArrayList<String>tester2 = ArrayListPractice.createRandomArray(25);
    // ArrayList<String>bigTester = ArrayListPractice.createRandomArray(100000);
    // System.out.println("Original: " + tester + "   Result: " + ArrayListPractice.makeReversedList(tester));
    // System.out.println("Original: " + tester2 + "   Result: " + ArrayListPractice.makeReversedList(tester2));
    // ArrayListPractice.makeReversedList(bigTester);

    // mixLists tests
    ArrayList<String>tester = ArrayListPractice.createRandomArray(5);
    ArrayList<String>tester2 = ArrayListPractice.createRandomArray(7);
    System.out.println(tester);
    System.out.println(tester2);
    System.out.println(ArrayListPractice.mixLists(tester, tester2));
  }
}
