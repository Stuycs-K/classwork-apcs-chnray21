public class MyArrays {
    public static String arrayToString(int[] nums) {
        String ans = "[";
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

    public static int[] returnCopy(int[] ary) {
        // makes a new int[] aryCopy, which is then filled with
        // the values from ary
        int[] aryCopy = new int[ary.length];

        for (int i = 0; i < ary.length; i++) {
            aryCopy[i] = ary[i];
        }

        return aryCopy;
    }

    public static int[] concatArray(int[] ary1, int[] ary2) {
        // create new int[] result, which will have
        // all values from ary1 added to it,
        // then all values from ary2 added to it
        int[] result = new int[ary1.length + ary2.length];

        for (int i = 0; i < ary1.length; i++) {
            result[i] = ary1[i];
        }

        for (int i = ary1.length; i < ary1.length + ary2.length; i++) {
            result[i] = ary2[i - ary1.length];
        }
    
        return result;
    }

    public static void main(String[] args) {
        // test cases for returnCopy
        int[] testArray = new int[] { 1, 2, 3, 4 };
        int[] newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);
        
        testArray = new int[] {11624, 120698, 3125, 3218, 8903, 3, 5, 1};
        newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);

        testArray = new int[] {};
        newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);
        
        testArray = new int[5];
        newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);

        testArray = new int[] {1000};
        newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);

        testArray = new int[] {-2135, 325, -53};
        newArray = returnCopy(testArray);
        System.out.println(arrayToString(testArray).equals(arrayToString(newArray))
                && testArray != newArray);
        
        // test cases for concatArray
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {5, 6, 7, 8};
        System.out.println("Expected [1, 2, 3, 4, 5, 6, 7, 8] result: " + arrayToString(concatArray(arr1, arr2)));

        arr1 = new int[] {};
        arr2 = new int[] {};
        System.out.println("Expected [] result: " + arrayToString(concatArray(arr1, arr2)));

        arr1 = new int[5];
        arr2 = new int[5];
        System.out.println("Expected [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] result: " + arrayToString(concatArray(arr1, arr2)));

        arr1 = new int[] {5};
        arr2 = new int[] {10000};
        System.out.println("Expected [5, 10000] result: " + arrayToString(concatArray(arr1, arr2)));

        arr1 = new int[] {-5, 231, -732, 4};
        arr2 = new int[] {2135, -35, -1230, 32, 32};
        System.out.println("Expected [-5, 231, -732, 4, 2135, -35, -1230, 32, 32] result: " + arrayToString(concatArray(arr1, arr2)));
    }
}
