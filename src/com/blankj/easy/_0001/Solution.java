package com.blankj.easy._001;

import java.util.Arrays;
import java.util.HashMap;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/04/21
 *     desc  :
 * </pre>
 */
public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; ++i) {
//            for (int j = i + 1; j < nums.length; ++j) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            Integer value = map.get(nums[i]);
            System.out.println("This is value: " + value);
            if (value != null) {
                System.out.println("This is :" + Arrays.toString((new int[] {value,i})));
                return new int[] { value, i };
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{11,12,23,24};
        int target = 9;
        int target2 = 35;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));
    }
}
