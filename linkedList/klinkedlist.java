package linkedList;
//merge two linked list zikzak type
class klinkedlist {
    Node head;
    class  Node{
        Node next;
        int val;
        Node(int d){
            this.val=d;
            this.next=null;
        }
    }
    klinkedlist(){

    }
    public  void addfirst(int k){
        Node dummyNode=new Node(k);
        Node temp=head;
        if(temp==null){
            dummyNode.next=null;
            head=dummyNode;

        }
        else{
            dummyNode.next=head;
            head=dummyNode;
        }
    }
    public Node mergelist(Node head1,Node head2){
        Node dummyNode=new Node(0);
        Node temp=dummyNode;

            while(head1!=null&&head2!=null){
                dummyNode.next=head1;
                head1=head1.next;
                dummyNode=dummyNode.next;
                dummyNode.next=head2;
                head2=head2.next;
                dummyNode=dummyNode.next;

            }
        if(head1!=null){
            dummyNode.next=head1;
        }
        if(head2!=null){
            dummyNode.next=head2;
        }
     head=temp.next;
        return head;

    }
    public void display(){
        Node temp1=head;
        while (temp1!=null){
            System.out.print(temp1.val+" ");
            temp1=temp1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        klinkedlist linkedlist=new klinkedlist();
        linkedlist.addfirst(5);
        linkedlist.addfirst(4);
        linkedlist.addfirst(3);
        linkedlist.addfirst(2);
        linkedlist.addfirst(1);
        klinkedlist linkedlist1=new klinkedlist();
        linkedlist1.addfirst(9);
        linkedlist1.addfirst(8);
        linkedlist1.addfirst(7);
        linkedlist1.addfirst(6);



       linkedlist1.head=new klinkedlist().mergelist(linkedlist.head,linkedlist1.head);
       linkedlist1.display();






    }
}
