
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method

class DynamicArrayDeque<Item> implements Deque<Item> {

    private static final int INITIAL_CAPACITY = 4;

    private Item[] deque;
    private int head;
    private int tail;
    private int size;
    // Note: if head==tail, the stack can be either empty or full,
    // therefore we include a size variable.

    @SuppressWarnings("unchecked")
    public DynamicArrayDeque() {
        deque = (Item[]) new Object[INITIAL_CAPACITY];
        head = tail = size = 0;
    }

    public void addFirst(Item x) {
        // TODO, a.k.a. push(x)
    }

    public void addLast(Item x) {
        // TODO, a.k.a. enqueue(x)
    }

    public Item removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        // TODO, a.k.a. pop() and dequeue()
        return null;
    }

    public Item removeLast() {
        if (isEmpty()) throw new NoSuchElementException("Deque underflow");
        // TODO
        return null;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        // We don't want to go below the INITIAL_CAPACITY
        if (capacity < INITIAL_CAPACITY) return;
        // TODO
    }

    public Item getFirst() {
        // TODO, a.k.a. peek()
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
       return new CircularArrayIterator();
    }

    private class CircularArrayIterator implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext() {
            return i < size;
        }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item x = deque[(i + head) % deque.length];
            i += 1;
            return x;
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
        DynamicArrayDeque<String> deque = new DynamicArrayDeque<String>();
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

