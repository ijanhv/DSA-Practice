package com.janhavi.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        System.out.println();
//        System.out.println(list);
//        list.insertFirst(23);
//        list.insertFirst(34);
//        list.insertFirst(44);
//        list.insertFirst(12);
//        list.insertLast(45);
//        list.insertFirst(62);
//        list.insertFirst(10);
//        list.insertLast(98);
//        list.insertLast(58);
//        System.out.println("Displaying Linked List");
//        list.display();
//        list.insertAtPosition(3, 100);
//        System.out.println("Inserting at position");
//        list.display();
//        System.out.print("Deleting First node");
//        list.deleteFirst();
//        System.out.println();
//        list.display();
//        System.out.println("Deleting Last element");
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println("Deleting from index");
//        System.out.println(list.delete(5));
//        list.display();
//
//       <----- DLL ----->
//        DLL list = new DLL();
//        list.insertFirst(23);
//        list.insertFirst(27);
//        list.insertFirst(47);
//
//        list.insertLast(34);
//        list.insertLast(54);
//        list.display();
//        System.out.println();
//        list.insertAfterValue(34, 66);
//        list.display();

//        <-------CLL-------->

        CLL list = new CLL();
        list.insert(34);
        list.insert(45);
        list.insert(65);
        list.insert(54);
        list.insert(90);
        list.display();
        list.delete(65);
        list.display();


    }
}
