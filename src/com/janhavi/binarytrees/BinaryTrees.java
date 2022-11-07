package com.janhavi.binarytrees;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryTrees {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
//        System.out.println("Height : " + height(root));
//        System.out.println();
//        System.out.println("Size: " + size(root));
          ArrayList<Integer> ans = printLeftView(root);
          System.out.print(Arrays.toString(new ArrayList[]{ans}));


    }

    static Node createTree() {
        Node root = null;
        System.out.print("Enter data: ");
        int data = scan.nextInt();
        if(data == -1) return null;
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }
    static void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static int height(Node root) {
        if(root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int size(Node root) {
        if(root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    static int maximum(Node root) {
        if(root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    static ArrayList<Integer> printLeftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        printLeftViewUtil(root, list, 0);
        return list;
    }

   static void printLeftViewUtil(Node root, ArrayList<Integer> list, int level) {
        if(root == null) return;

       if(level == list.size()) {
            list.add(root.data);
       }

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
    }

}
class Node {
    Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}

