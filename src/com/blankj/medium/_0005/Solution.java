package com.blankj.medium._0005;

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
 *     time  : 2017/11/04
 *     desc  :
 * </pre>
 */
public class Solution {
//    int st, end;
//
//    public String longestPalindrome(String s) {
////        st = 0;
////        end = 0;
//        int len = s.length();
//        if (len <= 1) return s;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < len; i++) {
//            helper(chars, i, i);
//            helper(chars, i, i + 1);
//        }
//        return s.substring(st, end + 1);
//    }
//
//    private void helper(char[] chars, int l, int r) {
//        while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
//            --l;
//            ++r;
//        }
//        if (end - st < r - l - 2) {
//            st = l + 1;
//            end = r - 1;
//        }
//    }

//    public String longestPalindrome(String s) {
//        int len = s.length();
//        if (len <= 1) return s;
//        int st = 0, end = 0;
//        char[] chars = s.toCharArray();
//        boolean[][] dp = new boolean[len][len];
//        for (int i = 0; i < len; i++) {
//            dp[i][i] = true;
//            for (int j = 0; j < i; j++) {
//                if (j + 1 == i) {
//                    dp[j][i] = chars[j] == chars[i];
//                } else {
//                    dp[j][i] = dp[j + 1][i - 1] && chars[j] == chars[i];
//                }
//                if (dp[j][i] && i - j > end - st) {
//                    st = j;
//                    end = i;
//                }
//            }
//        }
//        return s.substring(st, end + 1);
//    }

    public String longestPalindrome(String s) {

        return s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));

    }
}
