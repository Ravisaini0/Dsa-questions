class ll {
Node head;
class Node{
    // LinkedList 
    String data;    
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
    }
}
//insert first to last
    public void addFirst(String data){
        Node newnNode=new Node(data);
        newnNode.next=head;
        head=newnNode;
    }
//insert last to first
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lasNode=head;
        while (lasNode.next!=null) {
            lasNode=lasNode.next;

        }
        lasNode.next=newNode;
    }

}
public class LinkedListScratch {
    public static void main(String[] args) {
        ll list=new ll();
        list.addFirst("this");
    }
}
