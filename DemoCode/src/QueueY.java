import java.util.*;

public class QueueY {
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            next=null;
//        }
//    }
//    static class Queue{
////        static int arr[];
////        static int size;
////        static int rear=-1;
////        static int front=-1;
//
//        static Node head=null;
//        static Node tail=null;
//
////        Queue(int n){
////            arr=new int[n];
////            this.size=n;
////        }
//
//        //empty
//        public static boolean isEmpty(){
//            //return rear==-1;
//            //return rear==-1 && front==-1;
//            return head==null & tail==null;
//        }
//
//        //full
////        public static boolean isFull(){
////            return (rear+1) % size==front;
////        }
//        //add
//        public static void add(int data){
//            //if (rear==size-1){
////            if (isFull()){
////                System.out.println("Queue is Full");
////                return;
////            }
////            //1st element add
////            if (front==-1){
////                front=0;
////            }
////            //rear++;
////            rear=(rear+1) % size;
////            arr[rear]=data;
//
//            Node newNode=new Node(data);
//            if (tail==null){
//                tail=head=newNode;
//                return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//        }
//
//        //dequeue Remove O(n)
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("Queue is Empty");
//                return -1;
//            }
//            //int front=arr[0];
////            int result=arr[front];
//////            for (int i=0; i<rear; i++){
//////                arr[i]=arr[i+1];
//////            }
////            if (rear==front){
////                rear=front=-1;
////            }else {
////                front = (front+1) % size;
////            }
////            //rear--;
////            //return front;
////            return result;
//
//            int front=head.data;
//            if(head==tail){
//                tail=null;
//            }
//            head=head.next;
//            return front;
//        }
//
//        //Peek
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("Queue is Empty");
//                return -1;
//            }
//            //return arr[0];
//            //return arr[front];
//            return head.data;
//        }
//    }


    //Q.Queue using 2 Stack
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String arg[]){
        //Queue q = new Queue();
        //Queue<Integer> q = new LinkedList<>();
        //Queue<Integer> q = new ArrayDeque<>();

        //Queue using 2 stack
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
