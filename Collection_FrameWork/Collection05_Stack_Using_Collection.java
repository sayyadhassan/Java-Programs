package Collection_FrameWork;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Collection05_Stack_Using_Collection {
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();

        Collections.addAll(stack,8,9,5,4);
        stack.add(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.add(2,9);

        System.out.println(stack.get(2));  // It is worthless here

        System.out.println(stack);

        System.out.println(stack.peek());  // Will print ony head of stack

        System.out.println("Pop Operation");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");   // after this stack will empty
        }
        System.out.println("\nPeek Operation");
        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");   // peek operation is used only to see the top of the element
        }
        System.out.println(stack);

    }
}
