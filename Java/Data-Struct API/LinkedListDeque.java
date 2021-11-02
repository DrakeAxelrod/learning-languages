
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method

class LinkedListDeque<Item> implements Deque<Item> {

    private Node first;
    private Node last;
    private int size;

    // Note: to be able to define all Deque operations, we need a double-linked list!
    private class Node {
        Item value;
        Node next;
        Node previous;
        Node(Item x, Node n, Node p) {
            value = x;
            next = n;
            previous = p;
        }
    }

    public LinkedListDeque() {
        first = last = null;
        size = 0;
    }

    public void addFirst(Item x) {
        // TODO
        // Note: be aware of the special case when the deque is empty
    }

    public void addLast(Item x) {
        // TODO
        // Note: be aware of the special case when the deque is empty
    }

    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        // TODO
        // Note: be aware of the special case when the deque becomes empty
        return null;
    }

    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        // TODO
        // Note: be aware of the special case when the deque becomes empty
        return null;
    }

    public Item getFirst() {
        // TODO
        return null;
    }

    public Item getLast() {
        // TODO
        return null;
    }

    public boolean isEmpty() {
        // TODO
        return true;
    }

    public int size() {
        // TODO
        return 0;
    }

    // Iterate through all elements in the deque, in the order from first to last
    public Iterator<Item> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  {
            return current != null;
        }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item value = current.value;
            current = current.next; 
            return value;
        }
    }


    // Code for testing the class from the command line
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: give some command line arguments");
            System.err.println("   '-F' means removeFirst()");
            System.err.println("   '-L' means removeLast()");
            System.err.println("   '+Fx' means addFirst(x)");
            System.err.println("   '+Lx' means addLast(x)");
            System.exit(1);
        }
        LinkedListDeque<String> deque = new LinkedListDeque<String>();
        for (String item : args) {
            if (item.startsWith("-") && deque.isEmpty()) {
                System.out.println("Error: deque is empty, cannot remove!");
            } else if (item.equals("-F")) {
                System.out.println(deque.removeFirst());
            } else if (item.equals("-L")) {
                System.out.println(deque.removeLast());
            } else if (item.startsWith("+F")) {
                deque.addFirst(item.substring(2));
            } else if (item.startsWith("+L")) {
                deque.addLast(item.substring(2));
            } else {
                System.out.println("Error: unrecognised argument: " + item);
            }
        }
        System.out.print("(" + deque.size() + " items left in deque:");
        for (String item : deque) System.out.print(" " + item);
        System.out.println(")");
    }

}

