package com.blankj.easy._0543;

// Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// Example:
// Given a binary tree
//           1
//          / \
//         2   3
//        / \     
//       4   5    
// Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

// Note: The length of path between two nodes is represented by the number of edges between them.

import com.blankj.structure.TreeNode;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/13
 *     desc  :
 * </pre>
 */
public class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if (l + r > max) max = l + r;
        return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.diameterOfBinaryTree(TreeNode.createTestData("[1,2,3,4,5]")));
    }
}
