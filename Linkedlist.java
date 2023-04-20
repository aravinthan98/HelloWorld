public class Linkedlist {
    Node head;
    class Node{
        Node next;
        int val;
        Node(int d){
            this.val=d;
            this.next=null;
        }

    }
    Linkedlist(){

    }
    public void addfirst(int k){
        Node temp=head;
        Node newNode=new Node(k);
        if(temp==null){
            newNode.next=null;

        }
        else{
            newNode.next=temp;
        }
        head=newNode;
    }
    public void addatMidpos(int k){ //1 2 3 4 5 6 7 fast-3 5 7, slow > 2 3 4 k=9 k.next=5,3.next>9
        Node newNode=new Node(k);
        Node temp=head;
        Node fastpointer=head;
        Node slowponinter=head;
        while (fastpointer!=null&&fastpointer.next!=null){
            fastpointer=fastpointer.next.next;
            slowponinter=slowponinter.next; // 1 2 3 4 5   9>4,3>9
        }
        newNode.next=slowponinter.next;
        slowponinter.next=newNode;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+">");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist linkedlist=new Linkedlist();
        linkedlist.addfirst(7);
        linkedlist.addfirst(6);
        linkedlist.addfirst(5);
        linkedlist.addfirst(4);
        linkedlist.addfirst(3);
        linkedlist.addfirst(2);
        linkedlist.addfirst(1);
        linkedlist.display();
        linkedlist.addatMidpos(9);
        linkedlist.display();
    }

}
