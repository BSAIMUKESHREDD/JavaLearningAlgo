package com.saimukesh.datastructers.linkedList;

import java.util.LinkedList;

public class ConvertBinaryNumberinaLinkedListtoInteger1290 {


    // Definition for singly-linked list.
    LinkedList l = new LinkedList();

    class Solution {
        public int getDecimalValue(LinkedList linkedList) {
            
            linkedList curr = linkedList.get();
            while (curr!=null){
                x = (curr.val)*10^(linkedList.size()- linkedList.indexOf(curr));

                curr = curr.next;
            }
            return 0;
        }


        public void main(String[] args) {

        }
    }
}
