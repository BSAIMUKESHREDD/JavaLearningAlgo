package com.saimukesh.datastructers.linkedList;


public class DoublyLinkedList {


    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }
    }


    public Node head;
    public Node tail;

    public void setHead(Node node) {
        if (head == null) {
            tail = null;
            head = node;

        } else {
            head.prev = null;
            head.next = node;
            tail.prev = node;
            tail.next = null;


        }
    }

    public void setTail(Node node) {
        // Write your code here.
        if (tail == null) {
            tail = node;
            head = null;

        } else {
            head.prev = null;
            head.next = node;
            tail.prev = node;
            tail.next = null;


        }


    }

    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
        if (head == node) {
            head.prev = nodeToInsert;
            head.next = tail;
            tail.prev = node;
            tail.next = null;
        } else if (tail == node) {
            head.prev = null;
            head.next = nodeToInsert;
            tail.prev = nodeToInsert;
            tail.next = null;
        } else {
            head.prev = null;
            head.next = nodeToInsert;
            nodeToInsert.prev = head;
            nodeToInsert.next = node;
            node.prev = nodeToInsert;
            node.next = tail;
            tail.next = null;
            tail.prev = node;


        }

    }

    public void insertAfter(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
        // Write your code here.
    }

    public void removeNodesWithValue(int value) {
        // Write your code here.
    }

    public void remove(Node node) {
        // Write your code here.
    }

    public boolean containsNodeWithValue(int value) {
        // Write your code here.
        return false;
    }


    // Do not edit the class below.

    public boolean printNodes(DoublyLinkedList dl) {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return false;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            //Print each node and then go to next.
            System.out.print(current.value + " ");
            current = current.next;
        }
        return false;
    }
}




