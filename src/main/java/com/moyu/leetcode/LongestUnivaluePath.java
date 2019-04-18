package com.moyu.leetcode;

import com.moyu.leetcode.util.TreeNode;

/**
 * @program: thinking-in-java
 * @description:
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 * @author: wangzibin
 * @create: 2019-04-17 10:22
 **/
public class LongestUnivaluePath {

    int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode node) {
        if (node==null){
            return 0;
        }
        int left=arrowLength(node.left);
        int right=arrowLength(node.right);
        int arrowLeft=0,arrowRight=0;
        if (node.left!=null&&node.left.val==node.val){
            arrowLeft+=left+1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

    public static void main(String[] args) {

    }
}
