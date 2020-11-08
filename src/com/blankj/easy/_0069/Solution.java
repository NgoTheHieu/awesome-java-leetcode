package com.blankj.easy._0069;
// Implement int sqrt(int x).

// Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

// Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

// Example 1:
// Input: 4
// Output: 2
// Example 2:
// Input: 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since 
//              the decimal part is truncated, 2 is returned.
/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/05/08
 *     desc  :
 * </pre>
 */
public class Solution {
    public int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) >> 1;
        }
        return (int) n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(10));
    }
}
