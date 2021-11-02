
interface Map<Key, Value> {

    void put(Key k, Value v);
    // also: set(k, v)

    Value get(Key k);

    void remove(Key k);
    // also: delete(k)

    boolean contains(Key k);

    Iterable<Key> keys();
    // also: keySet(), iterator()

    boolean isEmpty();

    int size();
}
