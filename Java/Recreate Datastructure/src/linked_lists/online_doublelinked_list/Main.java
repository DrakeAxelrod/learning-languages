package linked_lists.online_doublelinked_list;

class Node
{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
}

class LinkedList
{
    public Node head;

    public LinkedList(int data)
    {
        Node a = new Node(data);
        head = a;
    }

    public void traversal()
    {
        Node temp = head; //temporary pointer to point to head

        while(temp != null)
        { //iterating over linked list
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println("");
    }

    //new node before head
    public void insertAtFront(Node n)
    {
        n.next = head;
        head.prev = n;
        head = n;
    }

    //insert new node at last
    public void insertAtTail(Node n)
    {
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }

    //function to insert a node after a node
    public void insertAfter(Node n, Node a)
    {
        n.next = a.next;
        a.next.prev = n;
        a.next = n;
        n.prev = a;
    }

    //function to delete
    public void del(Node a)
    {
        if(a.prev != null)
        { //node is not head
            a.prev.next = a.next;
        }
        else
        { //node a is head
            head = a.next;
        }

        if(a.next != null)
        {
            a.next.prev = a.prev;
        }
    }
}

class ListMain
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList(10);

        Node a,b,c;
        a = new Node(20);
        b = new Node(50);
        c = new Node(60);

        //connecting to linked list
  /*
     ----     ----     ----     ----
    |head|-->| a  |-->|  b |-->|  c |-->NULL
    |____|   |____|   |____|   |____|
  */

        l.head.next = a;
        a.next = b;
        b.next = c;

        l.traversal();

        Node z;

        z = new Node(0);
        l.insertAtFront(z);
        z = new Node(-10);
        l.insertAtFront(z);

        z = new Node(100);
        l.insertAtTail(z);

        z = new Node(30);
        l.insertAfter(z, a);
        z = new Node(40);
        l.insertAfter(z, a.next);
        z = new Node(500);
        l.insertAfter(z, a.next.next);

        l.traversal();

        l.del(l.head);
        l.del(z);

        l.traversal();
    }
}
