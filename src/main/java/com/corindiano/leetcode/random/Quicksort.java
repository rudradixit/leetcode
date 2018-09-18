package com.corindiano.leetcode.random;

public class Quicksort {
    private static void quicksort(int[] nums, int lo, int hi) {
        if (lo < hi) {
            int p = partition(nums, lo, hi);
            quicksort(nums, lo, p - 1);
            quicksort(nums, p + 1, hi);
        }
    }

    private static int partition(int[] nums, int lo, int hi) {
        int pivot = nums[hi];
        int wall = lo;

        for (int j=lo; j<hi; j++) {
            if (nums[j] < pivot) {
                swap(nums, wall, j);
                wall++;
            }
        }

        swap(nums, wall, hi);
        return wall;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        quicksort(nums, 0, nums.length - 1);
        for (int n : nums) System.out.print(n + " ");
    }
}