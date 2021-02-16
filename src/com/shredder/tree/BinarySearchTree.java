package com.shredder.tree;


/*
                8
              /  \
             3    10
            / \     \
           1   6     14
 */
public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(int value) {
        this.root = new TreeNode(value);
    }


    public TreeNode insert(int value) {

        //Create NewNode to Insert
        TreeNode newNode = new TreeNode(value);

        // CASE when Root Is NULL
        if (root == null) {
            this.root = newNode;
        } else {
            // CASE when Root is Not NULL
            TreeNode currentlyPointedNode = root;
            boolean keepWalking = true;

            while (keepWalking) {
                // CASE : Inserted Value BIGGER THAN Current Node's Value
                if (value >= currentlyPointedNode.value) {
                    // CASE : current node's Right Child is NULL
                    if (currentlyPointedNode.rightChild == null) {

                        // If its null, just assigning the new node to the right place
                        currentlyPointedNode.rightChild = newNode;
                        keepWalking = false;

                    } else {
                        // CASE WHEN current node's Right Child is not null , we need to keep walking right
                        currentlyPointedNode = currentlyPointedNode.rightChild;
                    }
                } else {
                    // CASE : Inserted Value SMALLER THAN Current Node's Value

                    // CASE WHEN current node's LEFT Child is null
                    if (currentlyPointedNode.leftChild == null) {

                        // If its null, just assigning the new node to the right place
                        currentlyPointedNode.leftChild = newNode;
                        keepWalking = false;
                    } else {
                        // CASE WHEN current node's Right Child is not null , we need to keep walking right
                        currentlyPointedNode = currentlyPointedNode.leftChild;
                    }

                }
            }
        }

        return root;
    }

    public TreeNode lookup(int value) {

        if (root == null) return null;

        TreeNode currentlyPointedNode = root;

        while (currentlyPointedNode != null) {

            // CASE : Search Value BIGGER THAN Current Node's Value
            if (value >= currentlyPointedNode.value) {

                // CASE : CurrentNode's Value EQUAL TO Searched Value
                if (currentlyPointedNode.value == value) {

                    return currentlyPointedNode;

                } else {
                    // CASE : CurrentNode's Value NOT EQUAL TO Searched Value , Keep Walking RIGHT
                    currentlyPointedNode = currentlyPointedNode.rightChild;
                }
            } else {
                // CASE : Search Value SMALLER THAN Current Node's Value

                // CASE : CurrentNode's Value EQUAL TO Searched Value
                if (currentlyPointedNode.value == value) {
                    return currentlyPointedNode;
                } else {
                    // CASE : CurrentNode's Value NOT EQUAL TO Searched Value , Keep Walking LEFT
                    currentlyPointedNode = currentlyPointedNode.leftChild;
                }
            }


        }

        return null;
    }


}
