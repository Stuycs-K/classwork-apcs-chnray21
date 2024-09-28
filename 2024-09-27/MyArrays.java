public class MyArrays {
  public static String arrayToString(int[] nums) {
    String ans = "[";
    for (int i=0; i<nums.length; i++) {
      ans += nums[i];
      ans = ans + ", ";
    }
    ans = ans.substring(0, ans.length()-2) + "]";
    return ans;
  }

  public static int[] returnCopy(int[] ary) {
    int[] aryCopy = new int[ary.length];

    for (int i=0; i<ary.length; i++) {
      aryCopy[i] = ary[i];
    }

    return aryCopy;
  }

  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] result = new int[0];
    return result;
  }

  public static void main(String[] args) {
    int[] testArray = new int[] {1, 2, 3, 4};
    int[] newArray = returnCopy(testArray);
    System.out.println(arrayToString(testArray) == arrayToString(newArray)
                        && testArray != newArray);

    testArray = new int[0];
    newArray = returnCopy(testArray);
    System.out.println(arrayToString(testArray) == arrayToString(newArray)
                        && testArray != newArray);

  }
}
