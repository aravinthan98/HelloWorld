package linkedList;

public class add1totheNode {
    static class Node
    {
        int data;
        Node next;
    }

    // Function to create a new node with given data
    static Node newNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
    public static Node reverseList(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;// 1 2 3 4 5 6-null
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }

    static Node addOne(Node head)
    {


        head=reverseList(head);

        Node ln = head;

        if (head.next == null)
        {
            head.data += 1;
            return head;
        }

        Node t = head;
        int prev;

        while (t.next != null)
        {
            if (t.data != 9)
            {
                ln = t;
            }
            t = t.next;
        }
        if (t.data == 9 && ln != null)
        {
            t = ln;
            t.data += 1;
            t = t.next;
            while (t != null)
            {
                t.data = 0;
                t = t.next;
            }
        }
        else
        {
            t.data += 1;
        }
        return head;
    }

    // A utility function to print a linked list
    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
///given umber
        Node head = newNode(6);
        head.next = newNode(5);
        head.next.next = newNode(4);


        System.out.print("List is ");
        printList(head);

        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
    }

}
