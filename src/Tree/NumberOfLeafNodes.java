/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-04-2022
 *   Time: 14:34
 *   File: NumberOfLeafNodes.java
 */

package Tree;

public class NumberOfLeafNodes {
    public static int leafNodes(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }


        return leafNodes(root.left) + leafNodes(root.right);
    }
}
