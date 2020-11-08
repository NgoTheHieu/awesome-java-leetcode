package com.blankj.easy._0111;


import com.blankj.structure.TreeNode;

import java.util.LinkedList;

// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 2
// Example 2:

// Input: root = [2,null,3,null,4,null,5,null,6]
// Output: 5

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/10
 *     desc  :
 * </pre>
 */
public class Solution {
//    public int minDepth(TreeNode root) {
//        if (root == null) return 0;
//        int l = minDepth(root.left);
//        int r = minDepth(root.right);
//        if (l != 0 && r != 0) return 1 + Math.min(l, r);
//        return l + r + 1;
//    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode node = q.remove();
                if (node.left == null && node.right == null) {
                    return ans;
                }
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            ++ans;
        }
        return 520;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode testData = TreeNode.createTestData("[1,2,2,3,3,3,3,4,4,4,4,4,4,null,null,5,5]");
        TreeNode.print(testData);
        System.out.println(solution.minDepth(testData));
    }
}
