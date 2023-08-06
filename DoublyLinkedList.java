import java.util.List;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
    
    private ListNode head;
    private ListNode tail;
    private int length;


    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }


    }

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }

    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }
        else{
            tail.next=newNode;
        }
        newNode.previous=tail;
        tail=newNode;
        length++;
    }

    public void insertFirst(int data){
        ListNode newNode=new ListNode(data);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void displayForward(){
        if(head==null)return;
        ListNode temp=head;

        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public void displayBackward(){
        if(tail==null)  return;
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.previous;

        }
        System.out.println("null");
    }

    public ListNode deleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp =head;
        if(head==tail){
            tail=null;
        }
        else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;

    }
    public ListNode deleteLastNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp= tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(20);
        dll.insertLast(25);
        dll.insertFirst(2);
        dll.displayForward();
        dll.displayBackward();
    }
}
