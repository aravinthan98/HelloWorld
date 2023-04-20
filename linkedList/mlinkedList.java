package linkedList;

public class mlinkedList {
    Node head;
    class Node{
        Node prev;
        Node next;
        int val;
        Node(int d){
            this.val=d;

        }
    }
    mlinkedList(){

    }
    public void addfirst(int k){
        Node newNode=new Node(k);
        Node temp=head;

            newNode.prev=null;
            newNode.next=head;
            if(temp!=null) {
                temp.prev = newNode;
            }

            head=newNode;

    }
    public void addlast(int k){
        Node newNode=new Node(k);
        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
        newNode.prev=temp;
        newNode.next=null;

        if(temp!=null) {
            temp.next = newNode;
        }


    }
    public void reverse() {
        //1 2 3 4 5 6  //1-null

        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;

        }
        if (temp != null){
            head = temp.prev;
        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print("<"+temp.val+">");


            temp=temp.next;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        mlinkedList linkedList=new mlinkedList();
        linkedList.addfirst(5);
        linkedList.addfirst(4);
        linkedList.addfirst(3);
        linkedList.addfirst(2);
        linkedList.addfirst(1);

        linkedList.addlast(6);
//        linkedList.display();
//        linkedList.reverse();
        linkedList.display();

    }
}
