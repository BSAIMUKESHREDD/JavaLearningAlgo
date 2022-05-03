package com.saimukesh.datastructers.ds.LinkedList;


class LL{
    public static void main(String[] args) {

    }

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }


    //addfirst
    public void addFirst(int data){
       Node newNode = new Node(data);

        if(head==null){
             head = newNode;
             return;
         }else{
            newNode.next = head;
            head = newNode;
        }
        return;

    }


    // add last
    public void addLast(int data ){
        Node newNode = new Node(data);

        if(head == null){head=newNode;return;}
        Node currNode = head;
        while (currNode!= null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //printLInkedlist

}