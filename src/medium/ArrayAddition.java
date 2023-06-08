package medium;

public class ArrayAddition {
    public static void main(String[] args) {
        //find max number and if sum of the others(any of them) equal is largest return true if not return false
        int[] arr1 = new int[]{5, 7, 16, 1, 2};
        System.out.println(ArrayAdditionTwoPointers(arr1)); // Output: false

        int[] arr2 = new int[]{3, 5, -1,8, 12};
        System.out.println(ArrayAdditionTwoPointers(arr2)); // Output: true
    }

    public static boolean ArrayAddition(int[] arr) {
// Find the largest number in the array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Calculate the sum of all numbers excluding the largest
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                sum += arr[i];// sum =the others sum except max
            }
        }


        return checkCombination(arr, sum, 0, max);

    }

    private static boolean checkCombination(int[] arr, int currentSum, int index, int target) {
        //target will be max
        if (currentSum == target) return true;
        if (currentSum < target || index >= arr.length) return false;
        // Try including the current number in the sum
        if (checkCombination(arr, currentSum, index + 1, target + arr[index])) return true;
        // Try excluding the current number in the sum
        if (checkCombination(arr, currentSum, index + 1, target)) return true;

        return false;
    }

    public static boolean ArrayAdditionTwoPointers(int[] arr) {
        // Find the largest number in the array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Calculate the sum of all numbers excluding the largest
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                sum += arr[i];// sum =the others sum except max
            }
        }

        int first = 0;
        int second = first+1;
        if (sum < max) return false;
        else {
            int temp=arr[first];
            while (first < arr.length && second < arr.length) {

                if (arr[second] == max) {second++;continue;}
                else temp += arr[second];
                if (temp == max) return true;
               if(second != arr.length - 1) second++;
                if (second == arr.length - 1) {
                    first++;
                    temp=arr[first];
                    second = first+1;

                }
            }
        }
return false;
    }
}
