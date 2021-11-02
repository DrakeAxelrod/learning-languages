
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method

class DynamicArray<Item> implements List<Item> {

    public DynamicArray() {
        // TODO
    }

    public void add(int i, Item x) {
        // TODO
    }

    public Item get(int i) {
        return null;
    }

    public Item set(int i, Item x) {
        // TODO
        // Note: return the previous value at positon i
        return null;
    }

    public Item remove(int i) {
        // TODO
        // Note: return the previous value at positon i
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

    // Iterate through all elements in the list, in the order from first to last
    public Iterator<Item> iterator() {
        // TODO
        return null;
    }


    // Code for testing the class from the command line
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: give some command line arguments");
            System.err.println("   '-3'  means remove(3)");
            System.err.println("   '?4'  means get(4)");
            System.err.println("   '+5x' means add(5,x)");
            System.err.println("   '=6x' means set(5,x)");
            System.exit(1);
        }
        DynamicArray<String> list = new DynamicArray<String>();
        for (String item : args) {
            if (item.startsWith("-")) {
                int i = Integer.parseInt(item.substring(1));
                System.out.println(list.remove(i));
            } else if (item.startsWith("?")) {
                int i = Integer.parseInt(item.substring(1));
                System.out.println(list.get(i));
            } else if (item.startsWith("+")) {
                int i = Integer.parseInt(item.substring(1, 2));
                list.add(i, item.substring(2));
            } else if (item.startsWith("=")) {
                int i = Integer.parseInt(item.substring(1, 2));
                list.set(i, item.substring(2));
            } else {
                System.out.println("Error: unrecognised argument: " + item);
            }
        }
        System.out.print("(" + list.size() + " items left in list:");
        for (String item : list) System.out.print(" " + item);
        System.out.println(")");
    }

}

