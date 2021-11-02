
interface Set<Item> extends Collection<Item> {

    void add(Item x);

    void remove(Item x);
    // also: delete(x)

    boolean contains(Item x);

    // from Collection: isEmpty(), size() 
    // from Iterable: iterator()
}
