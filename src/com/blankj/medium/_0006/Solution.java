package com.blankj.medium._0006;

// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);
 

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"
 

// Constraints:

// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000
/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/12/11
 *     desc  :
 * </pre>
 */

class Solution {

//    public String convert(String s, int numRows) {
//        if (numRows <= 1) return s;
//        int len = s.length();
//        char[] chars = s.toCharArray();
//        int cycle = 2 * (numRows - 1);
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < len; j += cycle) {
//            sb.append(chars[j]);
//        }
//        for (int i = 1; i < numRows - 1; i++) {
//            int step = 2 * i;
//            for (int j = i; j < len; j += step) {
//                sb.append(chars[j]);
//                step = cycle - step;
//            }
//        }
//        for (int j = numRows - 1; j < len; j += cycle) {
//            sb.append(chars[j]);
//        }
//        return sb.toString();
//    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int len = s.length();
        char[] chars = s.toCharArray();
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int i = 0;
        while (i < len) {
            for (int j = 0; j < numRows && i < len; ++j) {
                sbs[j].append(chars[i++]);
            }
            for (int j = numRows - 2; j >= 1 && i < len; --j) {
                sbs[j].append(chars[i++]);
            }
        }
        for (i = 1; i < numRows; i++) {
            sbs[0].append(sbs[i]);
        }
        return sbs[0].toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));// PAHNAPLSIIGYIR
        System.out.println(solution.convert("ABCD", 4));
    }
}
