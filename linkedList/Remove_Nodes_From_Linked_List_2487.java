package linkedList;

import java.util.ArrayList;
import java.util.Collections;
class linkedlist {
    Node head;

    class Node {
        Node next;
        int val;

        Node(int d) {
            this.val = d;
            this.next = null;
        }
    }

    linkedlist() {

    }
    public void addfirst(int k) {
        Node dummyNode = new Node(k);
        Node temp = head;
        if (temp == null) {//
            dummyNode.next = null;
            head = dummyNode;

        } else {
            dummyNode.next = head;
            head = dummyNode;
        }
    }
    public Node removeNodes(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node nextNode = removeNodes(head.next);

        if (nextNode.val > head.val) {
            return nextNode;
        }
        head.next = nextNode;

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
            int[] arr = {5, 2, 13, 3, 8};
            linkedlist linkedlist1 = new linkedlist();

            linkedlist1.addfirst(8);
            linkedlist1.addfirst(3);
            linkedlist1.addfirst(13);
            linkedlist1.addfirst(2);
            linkedlist1.addfirst(5);

            linkedlist1.head = new linkedlist().removeNodes(linkedlist1.head);
            linkedlist1.display();


        }


}
