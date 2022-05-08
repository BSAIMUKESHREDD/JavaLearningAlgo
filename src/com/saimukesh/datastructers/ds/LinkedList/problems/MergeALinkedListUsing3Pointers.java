package com.saimukesh.datastructers.ds.LinkedList.problems;



public class MergeALinkedListUsing3Pointers {

    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(){}

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }


        public void addFirst(int data){
            LinkedList newNode = new LinkedList(data);
            LinkedList head = null;
            if(head==null){
                head = newNode;
                return;
            }else{
                newNode.next = head;
                head = newNode;
            }
            return;



        }


    }


    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        LinkedList p1 = headOne;
        LinkedList p1prev = null;
        LinkedList p2 = headTwo;

        while(p1!=null && p2 !=null){
            if(p1!=null && p2!=null){
                p1prev=p1;
                p1=p1.next;
            }else {
                if(p1prev!=null) p1prev.next=p2;
                p1prev=p2;
                p2=p2.next;
                p1prev.next=p1;
            }
        }
            if(p1==null) p1prev.next=p2;
        return headOne.value< headTwo.value ? headOne : headTwo;
    }


    public static void main(String[] args) {
                LinkedList ll = new LinkedList(9);
                ll.addFirst(1);
                ll.addFirst(3);
                ll.addFirst(5);

        LinkedList l2 = new LinkedList(7);
        l2.addFirst(2);
        l2.addFirst(4);
        l2.addFirst(6);


       LinkedList ans =  mergeLinkedLists(ll,l2);
        while(ans!=null){
            System.out.println(ans.value);
            ans=ans.next;
        }

    }

}
