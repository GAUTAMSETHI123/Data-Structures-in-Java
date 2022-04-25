/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-04-2022
 *   Time: 23:54
 *   File: InvertBinaryTree.java
 */

package Tree;

public class InvertBinaryTree {
    public BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {
        if(root == null) {
            return root;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        // Swapping the left and right nodes using temp variable
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Repeat the same for left and right using recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
