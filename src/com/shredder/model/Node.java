package com.shredder.model;

public class Node<T>{

    public T VALUE;
    public Node<T> next;
    public Node<T> prev;

    //function
    public void displayItem(){
        System.out.printf("Value inside node -> %s\n", VALUE.toString());
    }
}
