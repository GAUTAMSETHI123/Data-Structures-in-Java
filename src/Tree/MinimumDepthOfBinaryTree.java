/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-04-2022
 *   Time: 14:19
 *   File: MaximumDepthOfBinaryTree.java
 */

package Tree;



public class MinimumDepthOfBinaryTree {
    public static int minDepth(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right) + 1;
        }
        if(root.right == null && root.left != null){
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
