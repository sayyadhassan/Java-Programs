package Collection_FrameWork;

import java.util.Collections;
import java.util.PriorityQueue;

// It will implement Min Heap bydefault, element will retreive in ascending order

public class Collection07_PriorityQueue_MinHeap {
    public static void main(String []args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Collections.addAll(pq,3,9,7,4,5,9);

        pq.forEach(e-> System.out.println(e));
    }
}
