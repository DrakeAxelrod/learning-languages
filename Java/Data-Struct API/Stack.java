
interface Stack<Item> extends Collection<Item> {

    void push(Item x);

    Item pop();

    Item peek();

    // from Collection: isEmpty(), size()
    // from Iterable: iterator()
}
