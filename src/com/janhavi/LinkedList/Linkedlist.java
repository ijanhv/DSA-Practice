package com.janhavi.LinkedList;

public class Linkedlist {

    public static Node head;
    public static Node tail;



    public class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        Linkedlist LL = new Linkedlist();
//        LL.head = new Node(2);
//        LL.next = new Node(4);

    }
}
