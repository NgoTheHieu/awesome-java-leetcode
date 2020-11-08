package com.blankj.easy._0088;

import java.util.Arrays;

// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

// Note:

// The number of elements initialized in nums1 and nums2 are m and n respectively.
// You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
// Example:

// Input:
// nums1 = [1,2,3,0,0,0], m = 3
// nums2 = [2,5,6],       n = 3

// Output: [1,2,2,3,5,6]
 

// Constraints:

// -10^9 <= nums1[i], nums2[i] <= 10^9
// nums1.length == m + n
// nums2.length == n

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/06/01
 *     desc  :
 * </pre>
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0)
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        while (n >= 0)
            nums1[p--] = nums2[n--];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[10];
        for (int i = 0; i < 5; ++i) {
            nums1[i] = 2 * i;
        }
        int[] nums2 = new int[5];
        for (int i = 0; i < 5; ++i) {
            nums2[i] = 2 * i + 1;
        }
        solution.merge(nums1, 5, nums2, 5);
        System.out.println(Arrays.toString(nums1));
    }
}
