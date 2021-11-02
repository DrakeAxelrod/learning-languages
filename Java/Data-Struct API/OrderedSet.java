
interface OrderedSet<Item> extends Set<Item> {

    Item min();
    // also: first()

    Item max();
    // also: last()

    Item floor(Item x);
    // returns the closest element ≤ x

    Item ceiling(Item x);
    // returns the closest element ≥ x

    // from Set: add(s), remove(x), contains()
    // from Collection: isEmpty(), size() 
    // from Iterable: iterator()
    // -- iterator() now returns the elements in order
}

