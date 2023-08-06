import java.util.List;
import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {


    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;
        private ListNode(int data){
            this.data=data;
        }
    }
    public CircularSinglyLinkedList(){
        last = null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public ListNode removeFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp= last.next;
        if(last.next==last){
            last=null;
        }
        else{
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;

    }


    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;
    }
    public void display(){
        if(last==null){
            return;
        }
        ListNode first= last.next;
        while(first!=last){
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data){
        ListNode temp= new ListNode(data);
        if (last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public void inserLast(int data){
        ListNode temp=new ListNode(data);
        if(last==null){
            last=temp;
            last.next=last;
        }
        else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        length++;
    }
    


    public static void main(String[] args) {
        CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.display();
        csll.inserLast(20);
        csll.insertFirst(0);
        csll.removeFirstNode();
        csll.removeFirstNode();
        csll.insertFirst(1);
        csll.display();
    }
}
