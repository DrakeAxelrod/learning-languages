package linked_lists.doublelinkedlist;

public class Main
{
    static class Node<T>
    {
        T data;
        Node prev;
        Node next;

        public Node(T data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    static class doubleLinkedList<T>
    {
        Node head;
        int size;

        public doubleLinkedList(){}
        public doubleLinkedList(T data)
        {
            head = new Node(data);
        }

        public void print()
        {
            System.out.println(head);
        }

        public void insertFront(T data)
        {
            if (head == null)
            {
                head = new Node(data);
            }
            else
            {
                Node n = new Node(data);
                n.next = head;
                head.prev = n;
                head = n;
            }


        }

        public void insertBack(T data)
        {
            if (head == null)
            {
                head = new Node(data);
            }
            else
            {
                Node node = new Node(data);
                Node tmp = head;
                while (tmp.next!= null)
                {
                    tmp = head.next;
                }
                    tmp.next = node;
                    node.prev = tmp;
            }
        }

        public void remove(int index)
        {
            Node tmp = head;
            for (int i = 0; i<index-1; i++)
            {
                tmp = tmp.next;
            }
            tmp.prev = tmp.next;
            tmp.next = tmp.prev;
        }
    }

    public static void main(String[] args) {
        doubleLinkedList<Integer> list = new doubleLinkedList<Integer>();
        list.insertFront(5);
        list.insertFront(6);
        list.insertFront(7);
        list.insertFront(8);
        list.print();
    }

}
