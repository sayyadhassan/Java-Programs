package Collection_FrameWork;
import java.util.ArrayDeque;

public class Collection09_DQueue {
    public static void main(String []args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(35);   // add element at last bydefault
        dq.offer(87);
        dq.offerFirst(320);   // add element at first
        dq.offerLast(55);     // add element at last
        System.out.println(dq);

        dq.pop();   // remove element from front bydeault
        System.out.println(dq);

        dq.pollFirst();   // remove element from front
        dq.pollLast();    // remove element from last
        System.out.println(dq);

        System.out.println(dq.peekFirst());    // print top element of the queue
        System.out.println(dq.peekLast());     // print last element of the queue
    }
}
