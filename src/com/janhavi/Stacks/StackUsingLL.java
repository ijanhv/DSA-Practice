package com.janhavi.Stacks;

public class StackUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node node = new Node(data); // make a new node and point the next of the new node to the head
            // if the stack is empty then make the node as the head
            if(isEmpty()) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }

        public static int pop() {
            // to get the top element we will return the head data and point the head to head.next
            if(isEmpty()) return  -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(isEmpty()) return  -1;

            return head.data;
        }


    }

    public static void main(String[] args) {

    }
}
