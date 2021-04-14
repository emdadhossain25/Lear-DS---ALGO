package session3;

import java.util.Arrays;

public class ArraySearchElement {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        int eltLinear = 6;
        int indexLinearSearch = linearSearch(nums, eltLinear);

        System.out.println("linearSearchResult: " + indexLinearSearch);
        int eltBinary = 6;
        int indexBinarySearch = binarySearch(nums, eltBinary);
        System.out.println("BinarySearchResult: " + indexBinarySearch);
        int maxElement = findMaxElement(nums);
        System.out.println("MaxElement: " + maxElement);
    }

    private static int binarySearch(int[] nums, int eltBinary) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == eltBinary) {
                return mid;
            } else if (nums[mid] < eltBinary) {
                start = mid + 1;
            } else if (nums[mid] > eltBinary) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int elt) {

        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == elt) {
                i = j;
            }
        }
        return i;
    }

    public static int findMaxElement(int[] nums) {
        int maxInd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[maxInd] < nums[i]) {
                maxInd = i;
            }
        }
        return nums[maxInd];
    }
}
