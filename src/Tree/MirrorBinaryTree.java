/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-04-2022
 *   Time: 23:50
 *   File: MirrorBinaryTree.java
 */

package Tree;

public class MirrorBinaryTree {

    public static void mirrorTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
