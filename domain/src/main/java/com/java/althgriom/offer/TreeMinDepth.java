package com.java.althgriom.offer;

import com.java.althgriom.leetcode.entity.TreeNode;

/**
 * @Description:
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 *
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class TreeMinDepth {

    public static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }


        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }

        if (root.left != null) {
            return minDepth(root.left) +1;
        }

        if (root.right != null) {
            return minDepth(root.right) + 1;
        }
        return 1;

    }
}
