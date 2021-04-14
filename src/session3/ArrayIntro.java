package session3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {


    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }


        System.out.println(Arrays.toString(nums));
    }
}
