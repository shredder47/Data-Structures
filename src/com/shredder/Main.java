package com.shredder;

public class Main {

    public static void main(String[] args) {

        Queue2 queue2 = new Queue2(5);

        queue2.insert(1);
        queue2.insert(2);
        queue2.insert(3);
        queue2.insert(4);
        queue2.insert(5);

        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        queue2.insert(10);
        queue2.insert(20);
        queue2.insert(30);
        queue2.insert(40);
        System.out.println(queue2.remove());

        queue2.insert(1000);
        System.out.println("----------------------");
        queue2.printContent();
        System.out.println("----------------------");
        queue2.insert(20);
//        System.out.println(queue2.remove());






    }


}
