import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String>result = new ArrayList<String>(size);
    for (int i = 0; i<size; i++) {
      int num = (int)(10*Math.random());
      if (num == 0) {
        result.add(i, "");
      }
      else {
        result.add(i, ""+num);
      }
    }
    return result;
  }
  public static void replaceEmpty(ArrayList<String>original) {
    for (int i = 0; i <original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String>makeReversedList(ArrayList<String>original) {
    System.out.println(original.size());
    ArrayList<String>result = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      result.add(i, original.get(i));
    }
    return result;
  }
}
