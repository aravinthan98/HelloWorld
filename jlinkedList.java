import java.util.Scanner;

public class jlinkedList {
    Node head;
    class Node{
        Node next;
        Node prev;
        int val;
        Node(int d){
            this.val=d;
            this.next=null;
            this.prev=null;
        }
    }
    jlinkedList(){

    }
    public void addfirst(int val){
        Node newNode=new Node(val);
//        Node temp=head;
        if(head==null){

            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            newNode.next=head;
            newNode.prev=null;
            head=newNode;

        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        jlinkedList linklist=new jlinkedList();
        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            linklist.addfirst(sc.nextInt());
//        }

       linklist.display();
    }

}
