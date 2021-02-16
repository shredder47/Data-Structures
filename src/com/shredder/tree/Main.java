package com.shredder.tree;

public class Main {

    /*
                8
              /  \
             3    10
            / \     \
           1   6     14
 */

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(8);
        binarySearchTree.insert(3);
        binarySearchTree.insert(10);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(14);

        TreeNode lookup = binarySearchTree.lookup(3);
        TreeNode lookup1 = binarySearchTree.lookup(8);
        TreeNode lookup2 = binarySearchTree.lookup(10);
        TreeNode lookup3 = binarySearchTree.lookup(55);

        System.out.println(lookup3);

    }
}
