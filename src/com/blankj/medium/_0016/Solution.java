package com.blankj.medium._0016;

import java.util.Arrays;

// Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 

// Constraints:

// 3 <= nums.length <= 10^3
// -10^3 <= nums[i] <= 10^3
// -10^4 <= target <= 10^4

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2018/01/25
 *     desc  :
 * </pre>
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int delta = 0x7fffffff, res = 0;
        Arrays.sort(nums);
        int len = nums.length - 2;
        for (int i = 0; i < len; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int curDelta = Math.abs(sum - target);
                if (curDelta == 0) return sum;
                if (curDelta < delta) {
                    delta = curDelta;
                    res = sum;
                }
                if (sum > target) --right;
                else ++left;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
