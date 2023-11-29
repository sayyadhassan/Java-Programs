package Java_8_Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteratro_ListIterator {
    public static void main(String []args){
        List list = new ArrayList<>();
        list.add("Rakesh");
        list.add(4);
        list.add("Mohan");
        list.add(9);
//        list.remove("Rakesh");


        // Using Iterator
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//            itr.remove();   // why it's not working here
//        }

        // Using ListIterator
        ListIterator listit = list.listIterator();

        // Retrive in forward direction
        while (listit.hasNext()){
            System.out.println(listit.next());
        }

//        listit.add(90);       // Will add element in last because we retrive element in forward direction that's why cursor will in last
//        System.out.println(list);
//
//        listit.set("Ramesh");  // Will set element in last because we retrive element in forward direction that's why cursor will in last
//        System.out.println(list);

        listit.remove();        // Will remove element in last because we retrive element in forward direction that's why cursor will in last
        System.out.println(list);

        System.out.println("----------------------------------------------------");

        // Retrive in backward direction but first of all need to move cursor in laste
//        while (listit.hasPrevious()){
//            System.out.println(listit.previous());
//        }

        listit.add(90);       // Will add element in first because we retrive element in backward direction that's why cursor will in first
//        System.out.println(list);
//
//        listit.set("Ramesh");  // Will set element in first because we retrive element in backward direction that's why cursor will in first
//        System.out.println(list);

        listit.remove();        // Will remove element in first because we retrive element in backward direction that's why cursor will in first
        System.out.println(list);

    }
}
