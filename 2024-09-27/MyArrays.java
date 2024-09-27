public class MyArrays {
  public static String arrayToString(int[] nums) {
    string ans = "[";
    for (int i-0; i<nums.length; i++) {
      ans += nums[i];
      ans = ans + ", ";
    }
    ans = ans.substring(0, ans.length()-2) + "]";
    return ans;
  }

  public static int[] returnCopy(int[] ary) {

  }

  public static int[] concatArray(int[] ary1, int[] ary2) {

  }

  public static void main(String[] args) {
    int[] testArray = new int {1, 2, 3, 4};
    int[] newArray = returnCopy(testArray);
    System.out.println(arrayToString(testArray) == arrayToString(newArray)
                        && testArray != newArray);

    testArray = new int {};
    newArray = returnCopy(testArray);
    System.out.println(arrayToString(testArray) == arrayToString(newArray)
                        && testArray != newArray);

  }
}
