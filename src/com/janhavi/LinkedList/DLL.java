package com.janhavi.LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL () {
        this.size = size;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size ++;
    }


    public void display() {
        Node temp = head;
        Node last = null;
        System.out.println("Print LL");
        while(temp != null) {
            last = temp;
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");

        while (last != null) {
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.print("START");
    }

//
//    public void displayRev() {
//       Node temp = head;
//       while(temp != null) {
//           temp = temp.next;
//       }
//       while(temp != null) {
//           System.out.print(temp.value + " <-> ");
//           temp = temp.prev;
//       }
//    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
