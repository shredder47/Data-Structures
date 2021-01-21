package com.shredder.linkedlist;

public class CircularLinkedList<T> {

    public Node<T> first;
    public Node<T> last;

    public CircularLinkedList() {
    }

    public void insertFirst(T data) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = data;

        if (first == null) {
            first = newNode;
            last = first;
        } else {

            newNode.next = first;
            first = newNode;
        }

    }

    public void insertLast(T data) {

        Node<T> newNode = new Node<>();
        newNode.VALUE = data;


        if (first == null) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }

    public T getFirst() {
        if (first == null) throw new RuntimeException("LinkedList is empty ");
        return first.VALUE;
    }

    public T getLast() {
        if (last == null) throw new RuntimeException("LinkedList is empty ");

        return first.VALUE;
    }

    public T deleteFirst() {

        if (first == null) throw new RuntimeException("LinkedList is empty ");

        T data = first.VALUE;

        first = first.next;
        System.out.println(data + " Deleted from first");
        return data;
    }

    public T deleteLast() {
        if (last == null || first == null) throw new RuntimeException("LinkedList is empty ");

        Node<T> lastNode = last;
        T oldData = lastNode.VALUE;
        if (first.hashCode() == last.hashCode()) { //++ Imp logic

            first = null;

        } else {
            Node<T> node = first;
            while (node.next.hashCode() != lastNode.hashCode()) {
                node = node.next;
            }
            node.next = null;
            last = node;

            System.out.println(oldData + " Deleted from last");
        }
        return oldData;

    }


    public void printItems() {

        Node<T> node = first;
        if (node == null) System.out.println("Empty LinkedList");
        else {
            System.out.println("\nPRINT START");
            while (node != null) {
                node.displayItem();
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

}
