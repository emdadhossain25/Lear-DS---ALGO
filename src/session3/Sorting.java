package session3;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 9, 43, 26};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] bubbleSort(int[] nums) {
//        this iteration only extends i value
        for (int i = 0; i < nums.length; i++) {
//            this iteration sorts the last value in ascending/descending order
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
