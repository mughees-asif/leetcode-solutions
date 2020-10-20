package com.mughees;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // check to see which is the smaller side of the container
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }
        return maxArea;
    }
}
