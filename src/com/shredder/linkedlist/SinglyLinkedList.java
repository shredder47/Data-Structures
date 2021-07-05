package com.shredder.linkedlist;

import com.shredder.model.Node;

public class SinglyLinkedList<T> {

    public Node<T> first;

    public SinglyLinkedList() {
    }

    public void insertFirst(T data) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = data;

        if (first != null) {
            newNode.next = first;
        }
        first = newNode;
    }

    public void insertLast(T data){

        Node<T> newNode = new Node<>();
        newNode.VALUE = data;

        if(first != null){
            Node<T> node = first;
            while (node.next!=null){

                node = node.next;
            }
            node.next = newNode;
        }else {
            first = newNode;
        }
    }

    public void printItems() {

        Node<T> node = first;
        if (node == null) System.out.println("Empty LinkedList");
        else {
            while (node != null) {
                node.displayItem();
                node = node.next;
            }
        }
    }

    public void clearAll() {

        first = null;
    }

    public int countItems() {

        int count = 0;

        Node<T> node = first;

        while (node != null) {

            count++;
            node = node.next;
        }

        return count;

    }

}
