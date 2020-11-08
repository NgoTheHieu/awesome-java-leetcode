package com.blankj.easy._0066;

import java.util.Arrays;

// Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

// Example 1 :
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.

// Example 2 :

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.

// Input: digits = [0]
// Output: [1]

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/05/06
 *     desc  :
 * </pre>
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int p = digits.length - 1;
        if (digits[p] < 9) {
            digits[p] = ++digits[p];
        } else {
            do {
                digits[p--] = 0;
            } while (p >= 0 && digits[p] == 9);
            if (digits[0] != 0) {
                ++digits[p];
            } else {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = solution.plusOne(new int[]{9, 9, 9});
        System.out.println(Arrays.toString(digits));
    }
}
