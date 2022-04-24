package com.saimukesh.datastructers.ds.Trees.ALgo;

import java.util.ArrayList;
import java.util.List;

public class SumOfBranchesInBST {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer>  sums = new ArrayList<Integer>();
            calculateBranchSums(root,0,sums);
            return sums;}


    public static void calculateBranchSums(BinaryTree node,int sum,List<Integer> sums){
        List<Integer>  list = new ArrayList<Integer>();

        if(node==null){return ;}
         int sumAll = sum+ node.value;
        if (node.left == null && node.right == null){
            list.add(sumAll);
            return;
        }

        calculateBranchSums(node.left,sumAll,sums);
        calculateBranchSums(node.right,sumAll,sums);

    }

}

