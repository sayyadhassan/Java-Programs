package Collection_FrameWork;
import java.util.LinkedList;
import java.util.Queue;

public class Collection06_Queue_Using_Colllection {
    public static void main(String []args){
        Queue<Integer> queue = new LinkedList<>();

        // Add element in the Queue
        queue.offer(34);
        queue.offer(32);
        queue.offer(23);
        queue.offer(30);

        boolean a = queue.offer(3);
        System.out.println(queue.offer(4));
        System.out.println(a);

        System.out.println(queue);

        System.out.println(queue.poll());  // Return and remove head of queue, return null if queue empty

        System.out.println(queue);

        System.out.println(queue.peek());  // Return head of the queue, return null if queue empty

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        System.out.println(queue);

        // These two lines will throw exception if queue is empty here
        System.out.println(queue.remove());
        System.out.println(queue.element());
    }
}
