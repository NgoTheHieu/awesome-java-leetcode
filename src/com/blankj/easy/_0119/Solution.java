package com.blankj.easy._0119;


import java.util.ArrayList;
import java.util.List;

// Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.

// Notice that the row index starts from 0.


// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Follow up:

// Could you optimize your algorithm to use only O(k) extra space?

 

// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1]
 

// Constraints:

// 0 <= rowIndex <= 40

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/11
 *     desc  :
 * </pre>
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            res.add(1);
            for (int j = i - 1; j > 0; --j) {
                res.set(j, res.get(j - 1) + res.get(j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(5));
    }
}
