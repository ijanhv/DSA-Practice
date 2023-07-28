package com.janhavi.Stacks;

import java.util.Stack;

public class ReverseAStack {

    public static void pushBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushBottom(stack, data);
        stack.push(top);
    }
    public static void reverseStackRecursion(Stack<Integer> stack) {
        if(stack.isEmpty()) return;

        int top = stack.pop();
        reverseStackRecursion(stack);
        pushBottom(stack, top);

    }

    public static void printStack(Stack<Integer> stack) {
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

//        printStack(stack);
        reverseStackRecursion(stack);
        printStack(stack);

    }
}
