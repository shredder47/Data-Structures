package com.shredder.linkedlist;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        linkedList.insertFirst(5);
        linkedList.insertLast(1000);
        linkedList.insertLast(200);
        linkedList.insertFirst(1200);
        System.out.println("Total Items -> "+ linkedList.countItems());
        linkedList.clearAll();
        linkedList.printItems();


        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.insertLast(100);
        circularLinkedList.insertLast(1000);
        circularLinkedList.insertFirst(10101);

        circularLinkedList.printItems();

        System.out.printf("Item deleted -> %S\n", circularLinkedList.deleteLast());
        circularLinkedList.printItems();

        System.out.printf("Item deleted -> %S\n", circularLinkedList.deleteFirst());
        circularLinkedList.printItems();

        System.out.printf("Item deleted -> %S\n", circularLinkedList.deleteLast());
        circularLinkedList.printItems();


        System.out.printf("Total Items %s\n", circularLinkedList.countItems());


    }
}
