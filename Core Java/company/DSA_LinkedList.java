package com.company;

import java.util.Scanner;

class DSA_LinkedList{
    Node head;
    public  int size;

    DSA_LinkedList(){
        size =0;
    }

    // Create Node
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // Insert at the begning
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Insert at the middle
    public void addinMiddle(int index,int data){
        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for(int i=1;i<size;i++){
            if(i == index){
                newNode.next = currNode.next;
                currNode.next = newNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    // Remove from First
    public void removeFirst(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }

        head = head.next;
        size--;
    }

    // Remove from Last
    public void removeLast(){
        if(head == null){
            System.out.println("List is already empty");
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
        size--;
    }

    // Print the list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Searching data
    public int searchElement(int data){
        if(head == null ){
            System.out.println("List is empty");
            return -1;
        }

        Node currNode = head;
        int i =0;
        while(currNode != null){
            if(currNode.data == data){
                return i;
            }
            currNode = currNode.next;
            i++;
        }
        System.out.println("Element is not present in the list");
        return -1;
    }




    // Return the size
    public int getSize(){
        return size;
    }

    // Show the structure of linked list
    public static void menu(){

        System.out.println("1 - Add First");
        System.out.println("2 - Add Last");
        System.out.println("3 - Add in Middle");
        System.out.println("4 - Search Data");
        System.out.println("5 - Remove First");
        System.out.println("6 - Remove Last");
        System.out.println("7 - Remove Greater Data");
        System.out.println("8 - Print the list");
        System.out.println("9 - Print the size of list");
        System.out.println("10 - Menu");
        System.out.println("11 - Exit");

    }

    public static void main(String []args){
        DSA_LinkedList list = new DSA_LinkedList();
        boolean condition = true;
        menu();
        while(condition) {
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the data want to be insert");
                    int data = sc.nextInt();
                    list.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter the data want to be insert");
                    int data1 = sc.nextInt();
                    list.addLast(data1);
                    break;
                case 3 :
                    System.out.println("Enter the element and index to be insert");
                    int data2 = sc.nextInt();
                    int index = sc.nextInt();
                    list.addinMiddle(index,data2);
                    break;
                case 4 :
                    System.out.println("Enter the data want to be searched");
                    int data3 = sc.nextInt();
                    System.out.printf("\nIndex no. of %d is : %d\n",data3,list.searchElement(data3));
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
//                case 7 :
//                    list.deleteElement();
//                    break;
                case 8:
                    list.printList();
                    break;
                case 9:
                    System.out.println(list.getSize());
                    break;
                case 10 :
                    menu();
                    break;
                case 11:
                    condition = false;
            }
        }
    }
}