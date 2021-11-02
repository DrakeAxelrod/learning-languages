
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method

class DynamicArrayStack<Item> implements Stack<Item> {

    private static final int INITIAL_CAPACITY = 4;

    private Item[] stack;
    private int size;

    @SuppressWarnings("unchecked")
    public DynamicArrayStack() {
        stack = (Item[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void push(Item x) {
        // TODO
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        // TODO
        return null;
    }

    private void resize(int capacity) {
        // We don't want to go below the INITIAL_CAPACITY
        if (capacity < INITIAL_CAPACITY) return;
        // TODO
    }

    public Item peek() {
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

    // Iterate through all elements in the stack, in the order they will be removed
    public Iterator<Item> iterator() {
       return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i;
        public ReverseArrayIterator() {
            i = size - 1;
        }
        public boolean hasNext() {
            return i >= 0;
        }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item x = stack[i];
            i -= 1;
            return x;
        }
    }


    // Code for testing the class from the command line
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: give some command line arguments, '-' means pop(), all others mean push()");
            System.exit(1);
        }
        DynamicArrayStack<String> stack = new DynamicArrayStack<String>();
        for (String item : args) {
            if (!item.equals("-")) {
                stack.push(item);
            } else if (!stack.isEmpty()) {
                System.out.println(stack.pop());
            } else {
                System.out.println("Error: stack is empty, cannot pop()!");
            }
        }
        System.out.print("(" + stack.size() + " items left on stack:");
        for (String item : stack) System.out.print(" " + item);
        System.out.println(")");
    }

}

