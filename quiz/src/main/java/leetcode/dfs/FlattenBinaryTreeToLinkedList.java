package leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * link {https://leetcode.com/problems/flatten-binary-tree-to-linked-list/}
 *
 * @author hyeonisism
 */
public class FlattenBinaryTreeToLinkedList {

    static class Solution {
        public void flatten(TreeNode root) {

            if (root == null) return;

            List<Integer> list = new ArrayList<>();

            dfs(root, list);

            root.left = null;

            TreeNode nextNode = root;

            for (final Integer integer : list) {
                nextNode.right = new TreeNode(integer);
                nextNode = nextNode.right;
            }
        }

        private void dfs(TreeNode root, List<Integer> list) {

            if (root.left != null) {
                list.add(root.left.val);
                dfs(root.left, list);
            }
            if (root.right != null) {
                list.add(root.right.val);
                dfs(root.right, list);
            }

        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
