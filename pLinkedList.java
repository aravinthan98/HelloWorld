// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class pLinkedList{
    Node head;
    class Node{
        Node next;
        int val;

        Node(int d){
            this.next=null;
            this.val=d;
        }
    }
    pLinkedList(){

    }
    public Node mergeNodes(Node head1,Node head2){
        Node newNode=new Node(0);
        Node temp=newNode;
        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1==null){
            temp.next=head2;
        }
        if(head2==null){
            temp.next=head1;
        }
        head=newNode.next;
        return head;
    }
    public void addfirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }
    public void displaynodes(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        pLinkedList linkedlist1=new pLinkedList();
        pLinkedList linkedlist2=new pLinkedList();

        linkedlist1.addfirst(4);
        linkedlist1.addfirst(2);
        linkedlist1.addfirst(1);

        linkedlist1.displaynodes();

        linkedlist2.addfirst(4);
        linkedlist2.addfirst(3);
        linkedlist2.addfirst(1);

        linkedlist2.displaynodes();


        linkedlist1.head=new pLinkedList().mergeNodes(linkedlist1.head,linkedlist2.head);
        linkedlist1.displaynodes();


    }

}