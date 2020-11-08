package com.blankj.easy._0118;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Example:

// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/11
 *     desc  :
 * </pre>
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return Collections.emptyList();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    sub.add(1);
                } else {
                    List<Integer> upSub = list.get(i - 1);
                    sub.add(upSub.get(j - 1) + upSub.get(j));
                }
            }
            list.add(sub);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
