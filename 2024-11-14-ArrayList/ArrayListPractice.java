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
        System.out.println(original.get(i));
        System.out.println(i);
        original.set(i, "Empty");
      }
    }
  }
}
