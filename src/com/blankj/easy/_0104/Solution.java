package com.blankj.easy._0104;


import com.blankj.structure.TreeNode;

// Given a binary tree, find its maximum depth.

// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

// Note: A leaf is a node with no children.

// Example:

// Given binary tree [3,9,20,null,null,15,7],

//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its depth = 3.

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/09
 *     desc  :
 * </pre>
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(TreeNode.createTestData("[]")));
        System.out.println(solution.maxDepth(TreeNode.createTestData("[1,2,2,3,4,4,3]")));
        System.out.println(solution.maxDepth(TreeNode.createTestData("[9,-42,-42,null,76,76,null,null,13,null,13]")));
    }
}
