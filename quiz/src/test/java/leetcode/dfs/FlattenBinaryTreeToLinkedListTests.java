package leetcode.dfs;

import leetcode.dfs.FlattenBinaryTreeToLinkedList.TreeNode;
import org.junit.jupiter.api.Test;

import static leetcode.dfs.FlattenBinaryTreeToLinkedList.Solution;
import static org.assertj.core.api.Assertions.assertThat;

class FlattenBinaryTreeToLinkedListTests {

    @Test
    void shouldDo() {
        //given
        TreeNode firstNode = new TreeNode(1);
        TreeNode secondNode = new TreeNode(2);
        TreeNode thirdNode = new TreeNode(3);
        TreeNode fourthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(5);
        TreeNode sixthNode = new TreeNode(6);

        firstNode.left = secondNode;
        secondNode.left = thirdNode;
        secondNode.right = fourthNode;
        firstNode.right = fifthNode;
        fifthNode.right = sixthNode;

        Solution solution = new Solution();

        //when
        solution.flatten(firstNode);

        //then
        for (int i = 1; i <= 6; i++) {
            assertThat(firstNode.val).isEqualTo(i);
            firstNode = firstNode.right;
        }
    }
}