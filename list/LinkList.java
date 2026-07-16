public class LinkList {
    public static void main(String[] args) {
        LL list=new LL();
        list.add(1);
        list.add(2);
        list.addLast(6);
        list.add(4);
       list.display();

        //Real LinkedList Design. Hum kabhi bahar se Node create nahi karte.Hum method banate hain.
        
        // Node list1=new Node(1);
        // Node list2=new Node(2);
        // Node list3=new Node(3);
        // Node list4=new Node(4);
        // list1.next=list2;
        // list2.next=list3;
        // list3.next=list4;
        // list4.next=null;
        // Node tep=list1;//head
        // while (tep!=null) {
        //     System.out.print(tep.data+" ");
        //     tep=tep.next;
        // }
    }
    
}
class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public void add(int data){// add first node
        Node newnNode=new Node(data);
         newnNode.next=head;
         head=newnNode;
    }
    public void addLast(int data){// end me node ko add krna 
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;

    }
    public void display(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        size++;
    }
}
}
// class Node{
//     public int data;
//     public Node next;
//     Node(int data){
//         this.data=data;
//         this.next=null;
//         size++;
//     }
// }