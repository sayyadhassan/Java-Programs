package Collection_FrameWork;

public class Collection04_Stack_Using_LinkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head = null;

        // Push Operation - insert data into Stack
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // When head==null it will return true otherwise false
        public static boolean isEmpty(){
            return head == null;
        }

        // Pop Operation - Look on the top of Stack the after remove the top node
        public int pop(){
            if(head == null){
                System.out.println("Stack is empty");
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        // Peek Operation - Look on the top of the Stack, but does not remove it
        public int peek(){
            if(head == null){
                System.out.println("Stack is alrady empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String []args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());   // after this stack will empty
//        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());  // after this stack will not empty, only it will print the element, will not remove
        }
    }
}
