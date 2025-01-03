public class ArrayDemo {
  public static void main(String[] args) {
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    /* int[] testArray = new int[] {1, 2, 3, 4};
    System.out.println(Arrays.toString(testArray).equals(arrToString(testArray)));

    testArray = new int[] {};
    System.out.println(Arrays.toString(testArray).equals(arrToString(testArray)));

    int[][] testArray2 = new int[][] {{1, 2}, {3, 4}, {5}};
    System.out.println(Arrays.deepToString(testArray2).equals(arrToString(testArray2)));

    testArray2 = new int[2][3];
    System.out.println(Arrays.deepToString(testArray2).equals(arrToString(testArray2)));
     */

    // countZeros test cases
    int[][] testArray = new int[3][5];
    System.out.println("Expected: 15    Result: " + countZeros2D(testArray));

    testArray = new int[][]{{1, 2}, {0, 9, 1235, 0}, {0, 1}, {123, 63, 19}};
    System.out.println("Expected: 3    Result: " + countZeros2D(testArray));

    // arrSum test cases
    System.out.println("Expected: 1453    Result: " + arr2DSum(testArray));

    testArray = new int[5][3];
    System.out.println("Expected: 0    Result: " + arr2DSum(testArray));

    // replaceNegative test cases
    testArray = new int[][]{{-1, 0, 5}, {-53}, {0, 2, -3, -7}};
    replaceNegative(testArray);
    System.out.println("Expected: [[1, 0, 5], [0], [0, 2, 1, 0]]     Result: " + arrToString(testArray));

    // htmlTable test cases
    testArray = new int[][]{{1, 2}, {3}};
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>      Result: " + htmlTable((testArray)));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] ary) {
    String ans = "[";
    if (ary == null) {
      return "null";
    }
    for (int i = 0; i < ary.length; i++) {
      if (i != ary.length - 1) {
        ans += ary[i];
        ans = ans + ", ";
      } else {
        ans += ary[i];
      }
    }
    return ans + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary) {
    String ans2 = "[";
    for (int i = 0; i < ary.length; i++) {
      ans2 += arrToString(ary[i]);
      if (i < ary.length - 1) {
        ans2 += ", ";
      }
    }
    return ans2 + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums) {
    int numzero = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          numzero++;
        }
      }
    }
    return numzero;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0 && i == j) {
          vals[i][j] = 1;
        } else if (vals[i][j] < 0) {
          vals[i][j] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums) {
    int[][] result = new int[nums.length][];

    for (int i = 0; i < nums.length; i++) {
      result[i] = returnCopy(nums[i]);
    }

    return result;
  }

  public static int[] returnCopy(int[] ary) {
    // makes a new int[] aryCopy, which is then filled with
    // the values from ary
    int[] aryCopy = new int[ary.length];

    for (int i = 0; i < ary.length; i++) {
      aryCopy[i] = ary[i];
    }

    return aryCopy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums) {
    // take nums and swap the length of nums and nums[0]
    int[][] result = new int[nums[0].length][nums.length];
    // get the first element of each sub-array in nums
    // and make it the elements in the first sub-array in result
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        result[j][i] += nums[i][j];
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][] nums) {
    String result = "<table>";
    for (int i = 0; i < nums.length; i++) {
      result += "<tr>";
      for (int j = 0; j<nums[i].length; j++) {
        result += "<td>" + nums[i][j] + "</td>";
      }
      result = result + "</tr>";
    }
    return result + "</table>";
  }
}

