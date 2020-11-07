public interface Stackable<T> {
    void push(Integer value);
    Integer pop();
    Integer peek();
    boolean isEmpty();
    int size();
    int search(Object o);
}
