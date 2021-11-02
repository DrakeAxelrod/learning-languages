
interface PriorityQueue<Item> extends Collection<Item> {

    void add(Item x);
    // also: insert(x), offer(x)

    Item removeMin();
    // also: delMin(), poll()

    Item getMin();
    // also: min(), peek()

    // from Collection: isEmpty(), size()
    // from Iterable: iterator()
}
