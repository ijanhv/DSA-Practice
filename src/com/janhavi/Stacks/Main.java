package com.janhavi.Stacks;

public class Main {
    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(5);

        stack.push(43);
        stack.push(56);
        stack.push(65);
        stack.push(12);
        stack.push(87);
        stack.push(32);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
