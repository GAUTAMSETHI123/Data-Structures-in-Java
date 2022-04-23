/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-04-2022
 *   Time: 01:58
 *   File: NodeAtDepthK.java
 */

package Tree;

public class NodeAtDepthK {
    public static void DepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }

        if(k ==0){
            System.out.println(root.data);
            return;
        }
        DepthK(root.left, k-1);
        DepthK(root.right, k-1);
    }
}
