//1. Write both your names + emails at the top of the document as a comment.
//Serena Chen; schen65@stuy.edu
//Raymond Chen; rchen60@stuy.edu

public class ArrayMethods {
    // 2. Copy your arrToString method from before.
    /**
     * Return a String that represents the array in the format:
     * "[2, 3, 4, 9]"
     * Note the comma+space between values, and between values
     */
    public static String arrToString(int[] nums) {
        String ans = "[";
        if (nums == null) {
            return "null";
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                ans += nums[i];
                ans = ans + ", ";
            } else {
                ans += nums[i];
            }
        }
        return ans + "]";
    }

    // 3. Write arrToString, with a 2D array parameter.
    // Note: Different parameters are allowed with the same function name.
    /**
     * Return a String that represents the 2D array in the format:
     * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
     * Note the comma+space between values, and between arrays
     * You are encouraged to notice that you may want to re-use
     * previous code, but you should NOT duplicate that code. (Don't copy/paste or
     * retype it)
     */

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

    /* Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][] nums) {
        // use a nested loop to solve this
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;// place holder return value so it compiles.
    }

    /**
     * Rotate an array by returning a new array with the rows and columns swapped.
     * You may assume the array is rectangular and neither rows nor cols is 0.
     * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
     */
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

    // 3. Modify a given 2D array of integer as follows:
    // Replace all the negative values:
    // -When the row number is the same as the column number replace
    // that negative with the value 1
    // -All other negatives replace with 0
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

    // 4. Make a copy of the given 2d array.
    // When testing : make sure that changing the original does NOT change the copy.
    // DO NOT use any built in methods that "copy" an array.
    // You SHOULD write a helper method for this.
    // If you don't see a good way to do that, you should stop and look at prior
    // methods.
    public static int[][] copy(int[][] nums) {
        int[][] result = new int[nums.length][];

        for (int i = 0; i < nums.length; i++) {
            result[i] = returnCopy(nums[i]);
        }

        return result;// placeholder so it compiles
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

    public static void main(String[] args) {
        // arrToString for 2D array test cases

        int[][] testCase2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Expected: [[1, 2, 3], [4, 5, 6]], result: " + arrToString(testCase2));

        testCase2 = new int[][] { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
        System.out.println("Expected: [[1], [2, 3], [4, 5, 6], [7, 8, 9, 10]], result: " + arrToString(testCase2));

        testCase2 = new int[2][];
        System.out.println("Expected: [null, null] ,result: " + arrToString(testCase2));

        testCase2 = new int[][] { { 12250, 2315, -9 }, { 1, 2, 3 }, { 9, 8, 7, 6, 5 } };
        System.out.println(
                "Expected: [[12250, 2315, -9], [1, 2, 3], [9, 8, 7, 6, 5]] ,result: " + arrToString(testCase2));

        // arr2DSum test cases
        testCase2 = new int[][] {};
        System.out.println("Expected: 0, result: " + arr2DSum(testCase2));

        testCase2 = new int[][] { { 1, 2, 3 }, { 7, 3 }, { 0, 0 }, {}, { 10, 20, 30 } };
        System.out.println("Expected: 76, result: " + arr2DSum(testCase2));

        testCase2 = new int[][] { { 1, 2, -3 }, { -7, 3 }, { 0, 0 }, {}, { -10, 20, -30 } };
        System.out.println("Expected: -24, result: " + arr2DSum(testCase2));

        testCase2 = new int[3][3];
        System.out.println("Expected: 0, result: " + arr2DSum(testCase2));

        // swapRC test cases
        testCase2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("Expected: [[1, 4], [2, 5], [3, 6]], result: " + arrToString(swapRC(testCase2)));

        testCase2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 } };
        System.out.println("Expected: [[1, 4, 7, 10, 13], [2, 5, 8, 11, 14], [3, 6, 9, 12, 15]], result: "
                + arrToString(swapRC(testCase2)));

        testCase2 = new int[][] { { -1, 2, -3 }, { 4, 5 }, { -6 }, { 7, 8, -9, -10 } };
        replaceNegative(testCase2);
        System.out.println("Expected: [[1, 2, 0], [4, 5], [0], [7, 8, 0, 1]], result: " + arrToString(testCase2));

        testCase2 = new int[][] { {} };
        replaceNegative(testCase2);
        System.out.println("Expected [[]], result: " + arrToString(testCase2));

        testCase2 = new int[][] { { -1, 0, 2, 10, -5 }, { 0, 0, 0, -1, -5 } };
        replaceNegative(testCase2);
        System.out.println("Expected [[1, 0, 2, 10, 0], [0, 0, 0, 0, 0]], result: " + arrToString(testCase2));

        testCase2 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
        int[][] copiedTest = copy(testCase2);
        System.out.println("Expected [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]], result: " + arrToString(copiedTest));
        testCase2 = new int[][] { { 1, 2 }, { 3, 4, 5, 6}, {0} };
        System.out.println("Original string has been changed. Is the copy still the same? " + arrToString(copiedTest));

        copiedTest = copy(testCase2);
        System.out.println("Expected [[1, 2], [3, 4, 5, 6], [0]], result: " + arrToString(copiedTest));
        testCase2 = new int[][] {{}};
        System.out.println("Original string has been changed. Is the copy still the same? " + arrToString(copiedTest));

    }
}