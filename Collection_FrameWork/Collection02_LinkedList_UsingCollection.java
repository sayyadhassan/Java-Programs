package Collection_FrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class Collection02_LinkedList_UsingCollection {
    public static void main(String []args){
        LinkedList<String> list = new LinkedList<>();
        // 1. add(element)
        list.add("Cow");    // Bydefault add in last
        list.add("Elephant");
        list.add("Dog");
        System.out.println(list);   // Print list
        //2. addFirst(element)
        list.addFirst("Crow");   // Add First
        // 3. addLast(element)
        list.addLast("Pigeon");  // Add Last
        System.out.println(list);
        // 4. peek()
        System.out.println(list.peek());  // Print Only First element of the list
        // 5. indexOf(element)
        System.out.println(list.indexOf("Dog"));  // Print index of element
        // 6. remove(int index)
        list.remove(3);   // Remove the element from given index
        System.out.println(list);
        // 7. removeFirst(object)
        list.removeFirst();    // Remove First element of the list
        System.out.println(list);
        // 8. removeLast(object)
        list.removeLast();     // Remove Last element of the list
        System.out.println(list);
        // 9. size()
        System.out.println(list.size());  // Print size of the element in the  list
        // 10. get(int index)
        System.out.println(list.get(1));  // Print element at the given index
        // 11. set(int,element)
        list.set(1,"Penguine");   // Replace the element at the specified position
        // 12. add(int index,element)
        list.add(2,"Elephant");
        System.out.println(list);
        // 13. isEmpty()
        System.out.println(list.isEmpty());  // Return true if List is empty othewise false
        //14. add(index,element)
        list.add(list.size()/2,"Gorilla");  // Add element in middle of liked-list
        //15. contains(value)
        System.out.println(list.contains("Elephant"));  // Return true if list contain the specified value
        //16. clear()
//        list.clear();      // Will remove all the element from the list


        list.add("Cow");
        list.addFirst("Crow");
        list.addFirst("Pigeon");
        list.addLast("Goat");
        System.out.println(list);


        // Element of the list can be traverse using 3 method

        // 1. For-loop
        for(int i=1;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }


        // 2. for-each-loop
//        for(String element : list){
//            System.out.println(element);
//        }

        // 3. Using itteratro
//        Iterator<String> st = list.iterator();
//        while(st.hasNext()){               // here hasNext check list is empty or not
//            System.out.println(st.next());
//        }

        // 4. Using Lamda Expression
        list.forEach(e-> System.out.println(e));

        //5.
        list.forEach(System.out::println);

        // Additional Operatons

        list.offer("Hassan");
        list.offerFirst("Naveen");
        System.out.println();

        list.forEach(System.out::println);

        Collections.reverse(list);
        System.out.println(Collections.binarySearch(list,"Hassan"));
        System.out.println(list);
    }

}
