package com.blankj.easy._0110;


import com.blankj.structure.TreeNode;

// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as:

// a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true
 

// Constraints:

// The number of nodes in the tree is in the range [0, 5000].
// -104 <= Node.val <= 104

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/09
 *     desc  :
 * </pre>
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;
        int l = helper(node.left);
        if (l == -1) return -1;
        int r = helper(node.right);
        if (r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testData = TreeNode.createTestData("[1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5]");
        TreeNode.print(testData);
        System.out.println(solution.isBalanced(testData));
    }
}
