
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method!

class LinkedListStack<Item> implements Stack<Item> {

    private Node head;
    private int size;

    private class Node {
        Item value;
        Node next;
        Node(Item x, Node n) {
            value = x;
            next = n;
        }
    }

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    public void push(Item x) {
        // TODO
    }

    public Item pop() {
        // TODO
        return null;
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
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<Item> {
        private Node current = head;
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
            System.err.println("Usage: give some command line arguments, '-' means pop(), all others mean push()");
            System.exit(1);
        }
        LinkedListStack<String> stack = new LinkedListStack<String>();
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

