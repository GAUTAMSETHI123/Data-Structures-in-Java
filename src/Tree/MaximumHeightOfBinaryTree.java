/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-04-2022
 *   Time: 14:23
 *   File: MaximumHeightOfBinaryTree.java
 */

package Tree;

public class MaximumHeightOfBinaryTree {
    public static int maxDepth(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return maxDepth(root.right) + 1;
        }
        if(root.right == null && root.left != null){
            return maxDepth(root.left) + 1;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
