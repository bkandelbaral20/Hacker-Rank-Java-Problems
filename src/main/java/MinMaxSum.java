/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(minSum(nums));
        System.out.println(maxSum(nums));
    }

    static int minSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
        }
        return sum;
    }

    static int maxSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    //    Alternative way
    static void minMaxSum(int[] nums) {

        int minSum = 0;
        int maxSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            minSum += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            maxSum += nums[i];
        }
        System.out.println(minSum + " " + maxSum);

    }
}