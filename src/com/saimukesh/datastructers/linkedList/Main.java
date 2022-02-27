package com.saimukesh.datastructers.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedlistLearn ll = new LinkedlistLearn();
        DoublyLinkedList dl = new DoublyLinkedList();
        DoublyLinkedList.Node n = new DoublyLinkedList.Node(10);
        dl.setHead(n);

        System.out.println(dl.head.value);
        DoublyLinkedList.Node n2 = new DoublyLinkedList.Node(100);
        dl.setTail(n2);
        System.out.println(dl.tail.value);
        DoublyLinkedList.Node n3 = new DoublyLinkedList.Node(120);
        DoublyLinkedList.Node n4 = new DoublyLinkedList.Node(130);
dl.insertBefore(n,n4);
        //System.out.println(dl.head.value);




/*
        ll.insertFirst(54);
        ll.insertFirst(54545);
        ll.insertFirst(0);
        ll.insert(100,0);
        ll.insertLast(150);
        ll.deleteLast();
        ll.display();
        ll.insertLast(150);
            ll.deleteFirst();
        ll.display();*/

    }
}






















