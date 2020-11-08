package com.blankj.medium._0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Example 2:

// Input: nums = []
// Output: []
// Example 3:

// Input: nums = [0]
// Output: []
 

// Constraints:

// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/14
 *     desc  :
 * </pre>
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return list;
        Arrays.sort(nums);
        int max = nums[len - 1];
        if (max < 0) return list;
        for (int i = 0; i < len - 2; ) {
            if (nums[i] > 0) break;
            if (nums[i] + 2 * max < 0) {
                while (nums[i] == nums[++i] && i < len - 2) ;
                continue;
            }
            int left = i + 1, right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (nums[left] == nums[++left] && left < right) ;
                    while (nums[right] == nums[--right] && left < right) ;
                } else if (sum < 0) ++left;
                else --right;
            }
            while (nums[i] == nums[++i] && i < len - 2) ;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}