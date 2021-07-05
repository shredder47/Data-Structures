package com.shredder.linkedlist;

import com.shredder.model.Node;

public class DoublyLinkedList<T> {

    public Node<T> first;
    public Node<T> last;

    public DoublyLinkedList() {
    }

    public void insertFirst(T data) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = data;

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node<T> existingFirst = first;

            existingFirst.prev = newNode;
            newNode.next = existingFirst;

            first = newNode;
        }
    }

    public void insertLast(T data) {
        Node<T> newNode = new Node<>();
        newNode.VALUE = data;

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node<T> existingLast = last;

            existingLast.next = newNode;
            newNode.prev = existingLast;

            last = newNode;
        }
    }

    public T getFirst() {
        if (first == null) throw new RuntimeException("LinkedList is empty ");
        return first.VALUE;
    }

    public T getLast() {
        if (last == null) throw new RuntimeException("LinkedList is empty ");
        return last.VALUE;
    }

    public T deleteFirst() {
        T oldValue = null;
        if (first == null) throw new RuntimeException("The LinkedList is empty");
        if (first.next != null) {
            oldValue = first.VALUE;
            first = first.next;
            first.prev = null;
        } else {
            oldValue = first.VALUE;
            first = null;
        }
        return oldValue;
    }

    public T deleteLast() {
        T oldValue = null;

        if (first == null) throw new RuntimeException("The LinkedList is empty");
        if (last == first) {
            oldValue = last.VALUE;
            last = null;
            first = null;
        } else {
            oldValue = last.VALUE;
            last = last.prev;
            last.next = null;
        }
        return oldValue;
    }

    public void insertAfter(T whichValue, T value) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = value;

        if (first == null && last == null) {
            System.out.println("LinkedList is empty! , Inserting at first position");
            insertFirst(value);
            return;
        }

        Node<T> requiredNode = first;

        while (requiredNode != null && !requiredNode.VALUE.equals(whichValue)) {
            requiredNode = requiredNode.next;
        }

        if (requiredNode == null) {
            System.out.println("Couldn't find the required value");
            return;
        }
        if (requiredNode != last) {

            newNode.prev = requiredNode;
            newNode.next = requiredNode.next;

            requiredNode.next = newNode;
            requiredNode.next.prev = newNode;
        } else {
            insertLast(value);
        }

    }

    public void insertBefore(T whichValue, T value) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = value;

        if (first == null && last == null) {
            System.out.println("LinkedList is empty! , Inserting at first position");
            insertFirst(value);
            return;
        }

        Node<T> requiredNode = first;

        while (requiredNode != null && !requiredNode.VALUE.equals(whichValue)) {
            requiredNode = requiredNode.next;
        }

        if (requiredNode == null) {
            System.out.println("Couldn't find the required value");
            return;
        }

        if (requiredNode != first) {

            newNode.next = requiredNode;
            newNode.prev = requiredNode.prev;

            //Ordering of next two lines are important , reason is if we assign prev with new node before
            //getting required node's left node ref will be lost for getting lefts next node.
            requiredNode.prev.next = newNode;
            requiredNode.prev = newNode;

        } else {
            insertFirst(value);
        }

    }

    public void deleteValue(T whichValue) {

        if (first == null) {
            System.out.println("List is empty, Nothing to Remove");
            return;
        }
        Node<T> requiredNode = first;
        while (requiredNode != null && !requiredNode.VALUE.equals(whichValue)) {
            requiredNode = requiredNode.next;
        }

        if (requiredNode == null) {
            System.out.println("Value not found in  the LList");
            return;
        }

        if (requiredNode.equals(first)) deleteFirst();
        else if (requiredNode.equals(last)) deleteLast();
        else {
            requiredNode.prev.next = requiredNode.next;
            requiredNode.next.prev = requiredNode.prev;
        }
        System.out.println("Deleted value " + whichValue);

    }


    public void printItems() {

        Node<T> node = first;
        if (node == null) System.out.println("Empty LinkedList");
        else {
            System.out.println("\nPRINT START");
            while (node != null) {
                node.displayItem();
                System.out.println(node.prev + " :: " + node + " :: " + node.next + "\n");

                node = node.next;
            }
            System.out.println("PRINT END\n");

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

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
