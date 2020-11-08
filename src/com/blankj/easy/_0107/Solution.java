package com.blankj.easy._0107;


import com.blankj.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 2017/10/09
 *     desc  :
 * </pre>
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        helper(list, root, 0);
        return list;
    }

    private void helper(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) return;
        if (level >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        helper(list, root.left, level + 1);
        helper(list, root.right, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[]")));
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[1,2,2,3,4,4,3]")));
        System.out.println(solution.levelOrderBottom(TreeNode.createTestData("[9,-42,-42,null,76,76,null,null,13,null,13]")));
    }
}
