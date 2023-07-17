package com.janhavi.Queue;

public class QueuseUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // No need to check if size of queue is full because the size of linked list can be increased
        public static void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) return -1;
            int ans = head.data;

            if(tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return ans;


        }

        public static int peek() {
            if(isEmpty()) return -1;
            return head.data;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
