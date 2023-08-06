import java.util.List;

public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+ "-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertAtTheBeginning(int data){
        ListNode current = new ListNode(data);
        current.next =head;
        head= current;
    }

    public void insertEnd(int data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current = head;
        while(null!=current.next){
            current= current.next;
        }
        current.next=newNode;
    }

    public void insertPosition(int data, int position){
        ListNode newNode=new ListNode(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current= previous.next; 
            newNode.next=current;
            previous.next=newNode;
        }
    }

    public void reverse(){
        ListNode current= head;
        ListNode Next= null;
        ListNode previous= null;
        while(current!=null){
            Next=current.next;
            current.next=previous;
            previous=current;
            current=Next;
        }
        head=previous;
    } 


    public void insert(int data){
        ListNode newNode= new ListNode(data);
        ListNode current=head;
        ListNode temp=null;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
    }

    public boolean containLoop(){
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr){
                return true;
            }
        }
        return false;
    }
    public ListNode startNodeInALoop(){
        ListNode fastptr=head;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr){
                return getStartingNode(slowptr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowptr) {
        ListNode temp=head;
        while(temp!=slowptr){
            temp=temp.next;
            slowptr=slowptr.next;

        }
        return temp;
    }


    public void removeLoop(){
        ListNode fastptr=head;
        ListNode slowPtr = head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowPtr=slowPtr.next;
            if(fastptr==slowPtr){
                removeLoopNow(slowPtr);
                return;
            
            }
        }
    }


    private void removeLoopNow(ListNode slowPtr) {
        ListNode temp=head;
        while(temp.next!=slowPtr.next){
            temp=temp.next;
            slowPtr.next=slowPtr.next;
        }
        slowPtr.next=null;
    }

    public static ListNode merge(ListNode a, ListNode b){
        ListNode dummy= new ListNode(0);
        ListNode tail= dummy;
        while(a!=null && b!=null){
            if (a.data<=b.data) {
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;

        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummy.next;
    }

    public static ListNode sumListNode(ListNode a, ListNode b){
        ListNode dummy= new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(a!=null|| b!=null){

            int x=(a!=null)? a.data:0;
            int y=(b!=null)? b.data:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.head=new ListNode(10);
        ListNode second= new ListNode(20);
        ListNode third= new ListNode(30);
        ListNode fourth= new ListNode(40);
        sll.head.next=second;
        second.next=third; 
        third.next=fourth;
        // fourth.next=second;
        //sll.display();
        // sll.insertAtTheBeginning(10);
        // sll.display();
        // sll.insertEnd(50);
        // sll.display();
        // sll.insertPosition(8,3);
        // sll.display();
        // sll.reverse();
        // sll.display();
        // System.out.println(sll.containLoop());
        // System.out.println(sll.startNodeInALoop().data);
        // SinglyLinkedList sll1= new SinglyLinkedList();
        // sll1.insertEnd(1);
        // sll1.insertEnd(4);
        // sll1.insertEnd(8);
        // SinglyLinkedList sll2= new SinglyLinkedList();
        // sll2.insertEnd(3);
        // sll2.insertEnd(5);
        // sll2.insertEnd(8);
        // sll2.insertEnd(9);
        // sll2.insertEnd(14);
        // sll2.insertEnd(18);
        // sll1.display();
        // sll2.display();
         SinglyLinkedList result=new SinglyLinkedList();
        // result.head=merge(sll1.head,sll2.head);
        // result.display(); 
        SinglyLinkedList sll1=new SinglyLinkedList();
        SinglyLinkedList sll2=new SinglyLinkedList();
        sll1.insertEnd(7);
        sll1.insertEnd(4);
        sll1.insertEnd(9);
        sll2.insertEnd(5);
        sll2.insertEnd(6);
        result.head=sumListNode(sll1.head, sll2.head);
        result.display();

    }
}