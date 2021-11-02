
interface OrderedMap<Key, Value> extends Map<Key, Value> {

    Key minKey();
    // also: firstKey()

    Key maxKey();
    // also: lastKey()

    Key floorKey(Key k);
    // returns the closest key ≤ k

    Key ceilingKey(Key k);
    // returns the closest key ≥ k

    // from Map: put(k,v), get(k), remove(k), contains(k), keys(), isEmpty(), size()
    // -- keys() now returns the keys in order
}
