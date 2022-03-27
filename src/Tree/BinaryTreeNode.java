/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-03-2022
 *   Time: 15:19
 *   File: BinaryTreeNode.java
 */

package Tree;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;


    public BinaryTreeNode(T data){
        this.data = data;
    }

}
