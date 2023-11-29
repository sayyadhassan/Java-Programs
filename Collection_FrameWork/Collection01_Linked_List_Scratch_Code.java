package Collection_FrameWork;

//       Program of Linked List from Scratch
public class Collection01_Linked_List_Scratch_Code {

    class Node{       // Node, It is inner class
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;       // Head Node

    // Add first
     public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
            newNode.next = head;
            head = newNode;
     }

     // Add Laste
    public void addLaste(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         Node currNode = head;
         while (currNode.next != null){
             currNode = currNode.next;
         }
         currNode.next = newNode;
    }

    // Print List
    public void printList(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         Node currNode = head;
         while(currNode != null){
             System.out.print(currNode.data+"->");
             currNode = currNode.next;
         }
        System.out.println("NULL");
    }

    // Delete First Node
    public void deleteNode(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         head = head.next;
    }

    // Delete Laste Node
    public void deleteLasteNode(){
         if(head == null){
             System.out.println("List is empty");
         }
         Node secondLasteNode = head;
         Node lasteNode = head.next;
         while(lasteNode.next != null){
             lasteNode = lasteNode.next;
             secondLasteNode = secondLasteNode.next;
         }
         secondLasteNode.next = null;
    }

    public void checkSizeofList(){
         if(head == null){
             System.out.println("List is empty");
         }
         int size =0;
         Node currNode = head;
         while (currNode != null){
             size++;
             currNode = currNode.next;
         }
        System.out.println("Size of LinkedList is "+size);
    }

    // Reverse Linked List
    public void reverseList(){
         if(head == null || head.next==null){
             System.out.println("List contain only single element");
             return;
         }

         Node prevNode = head;
         Node currNode = head.next;
         while (currNode!= null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             // Update
             prevNode = currNode;
             currNode = nextNode;
         }

         head.next = null;
         head = prevNode;
    }

    // swap every two adjacent node of LinkedList
    public void reverseList2element(){
         if(head == null || head.next == null){
             return;
         }

         Node prveNode = head;
         Node currNode = head.next;

         head = currNode;

         while(true){
             Node nextNode = currNode.next;
             currNode.next = prveNode;

//             if next NULL or next is the last node
             if(nextNode==null || nextNode.next==null){
                 prveNode.next = nextNode;
                 break;
             }

             prveNode.next = nextNode.next;

             // update
             prveNode = nextNode;
             currNode = prveNode.next;
         }
    }

    public static void main(String []args){

         Collection01_Linked_List_Scratch_Code list = new Collection01_Linked_List_Scratch_Code();
         list.addFirst("name");
         list.addLaste("is");
         list.addLaste("Hassan");
         list.addFirst("My");
         list.printList();

         list.deleteNode();
         list.printList();

         list.deleteLasteNode();
         list.printList();
         list.checkSizeofList();

         list.reverseList();
         list.printList();

         list.reverseList2element();
         list.printList();
    }
}
