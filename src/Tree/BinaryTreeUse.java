/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-03-2022
 *   Time: 15:24
 *   File: BinaryTreeUse.java
 */

package Tree;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printBinaryTree(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");

        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }

        if (root.right != null) {
            System.out.print("R" + root.right.data + ",");
        }

        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }


    public static BinaryTreeNode<Integer> takeInputTree() {
        System.out.println("enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputTree();
        BinaryTreeNode<Integer> rightChild = takeInputTree();
        root.left = leftChild;
        root.right = rightChild;
        return root;


    }

    public static int nodeCount(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftCount = nodeCount(root.left);
        int rightCount = nodeCount(root.right);
        return 1 + leftCount + rightCount;
    }

    public static int nodeSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }


        int leftsum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);
        return root.data + leftsum + rightSum;
    }

    public static int largestData(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int left = largestData(root.left);
        int right = largestData(root.right);
        return Math.max(root.data, Math.max(left, right));
    }

    public static int greaterNode(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
        int count = (root.data > x) ? 1 : 0;
        if (root.left != null) {
            count += greaterNode(root.left, x);
        }
        if (root.right != null) {
            count += greaterNode(root.right, x);
        }
        return count;
    }

    public static int leafNodes(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }


            return leafNodes(root.left) + leafNodes(root.right);

        }

    public static void DepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }

        if(k ==0){
            System.out.print(root.data);
            return;
        }
        DepthK(root.left, k-1);
        DepthK(root.right, k-1);
    }




        public static void main (String[]args){
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


            BinaryTreeNode<Integer> root = takeInputTree();
            printBinaryTree(root);
            System.out.println("number of nodes present:" + nodeCount(root));
            System.out.println("sum of nodes:" + nodeSum(root));
            System.out.println("Largest node in the Binary tree: " + largestData(root));
            System.out.println("Number of Nodes Greater than given value: " + greaterNode(root, 5));
            System.out.println("Number Of leaf nodes are: " + leafNodes(root));
            System.out.println("number of nodes at depth k :");
            DepthK(root, 2);


        }
    }


