package linked_lists.singlelinked;

public class LinkedList<T>
{
    private Node head;

    public void print()
    {
        System.out.println(head);
    }
    public void addEnd(T data)
    {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while (n.getNext()!=null)
            {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    public void addStart(T data)
    {
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insert(int index, T value)
    {
        Node n = head;
        Node node = new Node();
        node.setData(value);
        if (index==0) {
            addStart(value);
        }
        else
        {
            for (int i = 0; i < index - 1; i++)
            {
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }
    public void remove(int index)
    {
        if (index == 0)
        {
            head = head.getNext();
        }
        else
        {
            Node n = head;
            Node tmp = null;
            for (int i = 0; i < index - 1; i++)
            {
                n = n.getNext();
            }
            tmp = n.getNext();
            n.setNext(tmp.getNext());
        }
    }

}