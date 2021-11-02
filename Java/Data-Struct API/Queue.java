
interface Queue<Item> extends Collection<Item> {

    void enqueue(Item x);

    Item dequeue();

    Item peek();

    // from Collection: isEmpty(), size()
    // from Iterable: iterator()
}
