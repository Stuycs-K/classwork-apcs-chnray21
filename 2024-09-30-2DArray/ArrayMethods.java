//1. Write both your names + emails at the top of the document as a comment.
//Serena Chen; schen65@stuy.edu
//Raymond Chen; rchen60@stuy.edu

public class ArrayMethods {
    //2. Copy your arrToString method from before.
    /**Return a String that represents the array in the format:
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
            } 
            else {
                ans += nums[i];
            }
        }
        return ans + "]";
    }
    
    //3. Write arrToString, with a 2D array parameter.
    //Note: Different parameters are allowed with the same function name.
    /**Return a String that represents the 2D array in the format:
        * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
        * Note the comma+space between values, and between arrays
        * You are encouraged to notice that you may want to re-use
        * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
        */
    
    public static String arrToString(int[][] ary) {
        String ans2 = "[";
        for (int i=0; i<ary.length; i++) {
            ans2 += arrToString(ary[i]);
            if (i<ary.length-1) {
                ans2 += ", ";
            }
        }
        return ans2 + "]";
    }
    
    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
        //use a nested loop to solve this
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums[i].length; j++) {
                sum += nums[i][j];
            }
        }
        return sum;//place holder return value so it compiles.
    }
    
    /**Rotate an array by returning a new array with the rows and columns swapped.
        * You may assume the array is rectangular and neither rows nor cols is 0.
        * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
        */
    public static int[][] swapRC(int[][]nums){
        // take nums and swap the length of nums and nums[0]
        int[][] result = new int[nums[0].length][nums.length];
            // get the first element of each sub-array in nums
            // and make it the elements in the first sub-array in result
            for (int i=0; i<nums.length; i++) {
                for (int j=0; j<nums[0].length; j++) {
                    result[j][i] += nums[i][j];
                }
            }
        return result;
    }
    
    public static void main(String[] args) {
        // arrToString for 2D array test cases

        int[][] testCase2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Expected: [[1, 2, 3], [4, 5, 6]], result: " + arrToString(testCase2));

        testCase2 = new int[][] {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println("Expected: [[1], [2, 3], [4, 5, 6], [7, 8, 9, 10]], result: " + arrToString(testCase2));

        testCase2 = new int[2][];
        System.out.println("Expected: [null, null] ,result: " + arrToString(testCase2));

        testCase2 = new int[][] {{12250, 2315, -9}, {1, 2, 3}, {9, 8, 7, 6, 5}};
        System.out.println("Expected: [[12250, 2315, -9], [1, 2, 3], [9, 8, 7, 6, 5]] ,result: " + arrToString(testCase2));

        // arr2DSum test cases
        testCase2 = new int[][] {};
        System.out.println("Expected: 0, result: " + arr2DSum(testCase2));

        testCase2 = new int[][] {{1, 2, 3}, {7, 3}, {0, 0}, {}, {10, 20, 30}};
        System.out.println("Expected: 76, result: " + arr2DSum(testCase2));

        testCase2 = new int[][] {{1, 2, -3}, {-7, 3}, {0, 0}, {}, {-10, 20, -30}};
        System.out.println("Expected: -24, result: " + arr2DSum(testCase2));

        testCase2 = new int[3][3];
        System.out.println("Expected: 0, result: " + arr2DSum(testCase2));

        // swapRC test cases
        testCase2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Expected: [[1, 4], [2, 5], [3, 6]], result: " + arrToString(swapRC(testCase2)));
    }
}