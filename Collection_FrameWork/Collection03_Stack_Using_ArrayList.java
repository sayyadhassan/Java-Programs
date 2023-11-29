package Collection_FrameWork;

import java.util.ArrayList;

class Collection03_Stack_Using_ArrayList {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        // Push Operation
        public void push(int data) {
            list.add(data);
        }

        // Check List is empty of not
        public boolean isEmpty(){
            return list.size() == 0;
        }

        // Pop Operation
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is alrady empty");
                return -1;
            }
             int top =list.remove(list.size()-1);
            return top;
        }

        // Peek Operation
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is alrady empty");
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String []args){
        Collection03_Stack_Using_ArrayList.Stack stack = new Collection03_Stack_Using_ArrayList.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());   // after this stack will empty
//        }

        while(!stack.isEmpty()){
            System.out.println(stack.peek());  // after this stack will not empty, only it will print the element, will not remove
        }
    }
}
