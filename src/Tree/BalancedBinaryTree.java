/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-05-2022
 *   Time: 14:34
 *   File: BalancedBinaryTree.java
 */

package Tree;

public class BalancedBinaryTree {

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;

        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }


        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight - rightHeight <=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
}
