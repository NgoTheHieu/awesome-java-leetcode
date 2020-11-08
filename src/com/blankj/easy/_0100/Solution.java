package com.blankj.easy._0100;


import com.blankj.structure.TreeNode;

// Given two binary trees, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

// Example 1:

// Input:     1         1
//           / \       / \
//          2   3     2   3

//         [1,2,3],   [1,2,3]

// Output: true
// Example 2:

// Input:     1         1
//           /           \
//          2             2

//         [1,2],     [1,null,2]

// Output: false
// Example 3:

// Input:     1         1
//           / \       / \
//          2   1     1   2

//         [1,2,1],   [1,1,2]

// Output: false

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/08
 *     desc  :
 * </pre>
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(
                TreeNode.createTestData("[1,2,2,null,3,null,3]"),
                TreeNode.createTestData("[1,2,2,null,3,null,3]"))
        );
        System.out.println(solution.isSameTree(
                TreeNode.createTestData("[1,2,2,null,3,null,3]"),
                TreeNode.createTestData("[1,2,2,null,3,null,null]"))
        );
    }
}
