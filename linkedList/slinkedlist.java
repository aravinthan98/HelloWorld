package linkedList;


public class slinkedlist {
    private Node head;
    private Node tail;
    private int size;
    private class Node {
        int val;
        Node next;

        Node() {

        }

        Node(int value) {
            this.val = value;
            this.next = null;
        }
    }
    slinkedlist(){

    }
    public void addelefirst(int arjun){
        Node newNode=new Node(arjun);
        if(this.size==0){
            this.head=newNode; ///2
            this.tail=newNode;
            this.size=1;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
    }
    public void play(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.val+">");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void removeLast(){
        Node temp=head;
        if(temp.next==null){
            temp=null;
            temp=tail;
        }
        else {
            while (temp.next.next != null) {
                temp = temp.next;

            }
            temp.next = null;
            tail = temp;
        }


    }
    public Node removeNthFromEnd( int k) {
        Node start = head;
        Node end = head;
        while(k-->0){
            end = end.next;
        }
        if(end ==null){
            start = start.next;
            return start;

        }
        while(end.next !=null){
            start = start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return head;
    }

}
