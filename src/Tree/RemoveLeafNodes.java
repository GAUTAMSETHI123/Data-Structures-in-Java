/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-04-2022
 *   Time: 17:58
 *   File: RemoveLeafNodes.java
 */

package Tree;

import javax.swing.*;

public class RemoveLeafNodes {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right==null){
            return null;
        }

        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
}
