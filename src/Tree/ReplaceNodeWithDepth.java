/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-04-2022
 *   Time: 03:00
 *   File: ReplaceNodeWithDepth.java
 */

package Tree;

public class ReplaceNodeWithDepth {
    public static void replaceNodeWithDepth(BinaryTreeNode<Integer> root, int level){
        if(root == null){
            return;
        }
        root.data = level;

        replaceNodeWithDepth(root.left,level+1);
        replaceNodeWithDepth(root.right, level+1);

    }


}
