import java.util.*;
public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //Add first
    public void addFirst(String data){
        Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //print
    public void printList(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate() {
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prevNode;
    }

//    public Node reverseRecursive(){
//        if (head==null || head.next==null){
//            return head;
//        }
//        Node newHead = reverseRecursive(head.next);
//        head.next.next=head;
//        head.next=null;
//        return newHead;
//    }

    public static void main(String arg[]){
        LL list =new LL();
        list.addFirst("A");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addLast("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addLast("This");
        System.out.println(list.getSize());

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();

        list.reverseIterate();
        list.printList();

//        list.head=list.reverseRecursive(list.head);
//        list.printList();
    }
}


// Linked List Using Collection Frameworks
//class LL{
//    public static void main(String arg[]){
//        LinkedList<String> list = new LinkedList<>();
//        list.addFirst("List");
//        list.addFirst("a");
//        list.addFirst("This");
//        System.out.println(list);
//
//        list.addLast("From");
//        System.out.println(list);
//
//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);

//        System.out.println(list.size());

//        Q1.Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
//        Search for the number 7 & display its index.
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(5);
//        list.add(7);
//        list.add(3);
//        list.add(8);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        System.out.println("Number " + list.get(2) +" is on index " + list.indexOf(7));

//        Q2.Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
//        Delete all nodes which have values greater than 25.
//        LinkedList<Integer> numbers = new LinkedList<>();
//        numbers.add(22);
//        numbers.add(34);
//        numbers.add(12);
//        numbers.add(45);
//        numbers.add(40);
//        numbers.add(19);
//        System.out.println(numbers);
//        for (int i=0; i<numbers.size(); i++) {
//            if (numbers.element()> 25) {
//                numbers.remove(i);
//                return;
//            }
//            System.out.println(numbers);
//        }
//
//    }
//}
