package com.saimukesh.datastructers.ds.problems;

public class delete_given_node {

     // Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public void deleteNode(ListNode node) {
            ListNode head = node;
            while(head!=null){
                if(node.val == head.val){
                    node = node.next;
                }
                head = head.next;
            }
            return ;
        }
    }

