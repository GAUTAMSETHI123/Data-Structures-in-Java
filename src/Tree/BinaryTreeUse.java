/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-03-2022
 *   Time: 15:24
 *   File: BinaryTreeUse.java
 */

package Tree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printBinaryTree(BinaryTreeNode<Integer> root){

        if(root == null){
            return ;
        }
        System.out.print(root.data+ ":");

        if(root.left != null){
            System.out.print("L" + root.left.data + ",");
        }

        if(root.right != null){
            System.out.print("R" + root.right.data + ",");
        }

        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }


    public static BinaryTreeNode<Integer> takeInputTree(){
        System.out.println("enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputTree();
        BinaryTreeNode<Integer> rightChild = takeInputTree();
        root.left = leftChild;
        root.right = rightChild;
        return root;


    }

    public static int nodeCount(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftCount = nodeCount(root.left);
        int rightCount = nodeCount(root.right);
        return 1 + leftCount + rightCount;
    }

    public static int nodeSum(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }


        int leftsum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);
        return root.data + leftsum + rightSum;
    }


    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//
//        root.left = rootLeft;
//        root.right= rootRight;
//
//
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(5);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(4);
//
//
//        rootLeft.right = twoRight;
//        rootRight.left = threeLeft;


        BinaryTreeNode<Integer>root = takeInputTree();
        printBinaryTree(root);
        System.out.println("number of nodes present:" + nodeCount(root));
        System.out.println("sum of nodes:" + nodeSum(root));



    }
}
