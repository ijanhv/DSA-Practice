package com.janhavi.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size ++;
    }

    public boolean hasCyle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseIterative() {
        if(size < 2) {
            return;
        }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public int findMiddle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }

    public int lengthOfCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && slow != null) {
            fast = fast.next;
            slow = slow.next;

            if(fast == slow) {
                //calculate the length
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare((findSquare(fast)));
        } while(fast != slow);

        if(slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }

        return ans;
    }



    //insert using recursion

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size ++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }



    public void insertAtPosition(int index, int val) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast() {
        if(size == 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END ");
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;


        }
    }
}
