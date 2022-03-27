/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-03-2022
 *   Time: 15:24
 *   File: BinaryTreeUse.java
 */

package Tree;

public class BinaryTreeUse {

    public static void printBinaryTree(BinaryTreeNode<Integer> root){

        if(root == null){
            return ;
        }
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);

        root.left = rootLeft;
        root.right= rootRight;


        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(4);


        rootLeft.right = twoRight;
        rootRight.left = threeLeft;

        printBinaryTree(root);



    }
}
