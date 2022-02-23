package com.saimukesh.datastructers.linkedList;


public class LinkedlistLearn {

   /*  LinkedlistLearn list = new LinkedlistLearn();
    list.add(23);
    list.add(42);*/

    private Node head;
    private  Node tail;
    private int size;

    public LinkedlistLearn(){
        this.size=0;
    }


    private class Node {
        private int  value;
        private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }



    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }



    public  void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        else if(index== size){
            insertLast(val);
            return;
        }
        else{

            Node temp = head;
            for(int i =0;i<index;i++){
                temp = temp.next;

            }
            Node  node = new Node(val,temp.next);
            temp.next= node;
            size++;

        }
    }
    
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"...");
            temp =temp.next;
        }
    }
}
