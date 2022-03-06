package com.saimukesh.datastructers.ds.Trees;

public class BST_Insert_remove_Delete {



        static class BST {
            public int value;
            public BST left;
            public BST right;

            public BST(int value) {
                this.value = value;
            }

            public BST insert(int value) {
                // Write your code here.
                // Do not edit the return statement of this method.
                BST currentNode = this;
                if(value<currentNode.value ){
                    if(currentNode.left == null){
                        BST newNode = new BST(value);
                        currentNode.left = newNode;
                    }
                    else{
                        currentNode = currentNode.left;
                    }
                }else {
                    if(currentNode.right == null){
                        BST newNode = new BST(value);
                        currentNode.right = newNode;

                    }else{
                        currentNode = currentNode.right;
                    }
                }

                return this;
            }

            public boolean contains(int value) {
                // Write your code here.

                return false;
            }

            public BST remove(int value) {
                // Write your code here.
                // Do not edit the return statement of this method.
                return this;
            }
        }


    public static void main(String[] args) {

    }
    }


