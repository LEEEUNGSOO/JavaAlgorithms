package com.multi.basic.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(90);
        pq.add(4);
        pq.add(5);
        System.out.println("PriorityQueue contents:"+pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println("PriorityQueue contents:"+pq);



    }
}
