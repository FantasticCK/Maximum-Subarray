package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int n = nums.length;
        int prefixSumMin = 0, globalMax = Integer.MIN_VALUE, prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            globalMax = Math.max(globalMax, prefixSum - prefixSumMin);
            prefixSumMin = Math.min(prefixSumMin, prefixSum);
        }
        return globalMax;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        // write your code
        if (nums.length == 0) return 0;
        int globalMax = Integer.MIN_VALUE, localSum = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            localSum += nums[i];
            globalMax = Math.max(globalMax, localSum);
            if (localSum < 0) localSum = 0;
        }
        return globalMax;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        // write your code
        int local = 0, globalMax = Integer.MIN_VALUE, n = nums.length;
        for (int i = 0; i < n; i++) {
            local = Math.max(nums[i], local + nums[i]);
            globalMax = Math.max(globalMax, local);
        }

        return globalMax;
    }
}