package com.mughees;

public class Main {

    public static void main(String[] args) {
        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));
        System.out.println(search(new int[] {-1}, 0));
    }

    public static int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
