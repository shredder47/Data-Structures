package com.shredder;


//My Impl of Queue
public class Queue2 {

    private final int maxSize;
    private final long[] queArray;
    private int rear;

    public Queue2(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        rear = -1 ;
    }

    public void insert(long val){
        if(isFull()) throw new RuntimeException("Queue is FULL");

        rear ++;
        queArray[rear] = val;
        System.out.printf("INSERTED %s at Position %s%n", val,rear);

    }
    public long remove(){ // remove item from the front of the queue

        if(isEmpty()) throw new RuntimeException("Queue is already Empty");

        long valToRemove = queArray[0];

        //After removal from front, the line move forward
        for(int i = 0 ; i < rear ; i++){
            queArray[i] = queArray[i+1];
        }

        rear --;
        System.out.printf("Removed %s : Current Rear Position %s -> " , valToRemove,rear);
        return valToRemove;
    }

    public void printContent(){

        for(int i = 0; i <= rear; i++){

            System.out.println(queArray[i]);
        }
    }

    public void printFUll(){

        for(int i = 0; i < queArray.length; i++){

            System.out.println(queArray[i]);
        }
    }

    public boolean isFull(){
        return rear == (maxSize - 1);
    }

    public boolean isEmpty(){
        return rear == -1;
    }


}
