package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, 2, 1, 2, 1}, 3));
        System.out.println(subarraySum(new int[]{1, 4, 20, 3, 10, 5}, 33));
    }

    static int subarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int counter = 0;
        int current_sum = 0;

        while(left < nums.length && right < nums.length) {
            current_sum += nums[right];
            if (current_sum < k) {
                right++;
            } else if (current_sum > k) {
                current_sum -= nums[left];
                left++;
            } else {
                counter++;
            }
            System.out.println("currentSum = " + current_sum);
        }
        return counter;
    }
}
