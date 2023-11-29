package Collection_FrameWork;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

// Bydefault PriorityQueue impliments MinHeap but by passing Comparator.reverseOrder() in paramenter
// we change order from MinHeap to MaxHeap, element will be retrive in descending order

public class Collection08_PriorityQueue_MaxHeap {
    public static void main(String []args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Collections.addAll(pq,2,6,4,5,9,0);

        pq.offer(4);

        pq.forEach(System.out::println);
    }
}
