public class Stack<T> implements Stackable<T> {

    private Stack<T> previous;
    private Integer value;

    Stack(){}

    Stack(int value){
        this.value = value;
    }

    Stack(Stack<T> privious, int value){
        this.previous = privious;
        this.value = value;
    }

    @Override
    public void push(Integer value) {
        this.previous = new Stack<T>(this.previous, this.value);
        this.value = value;
    }

    @Override
    public Integer pop() {
        if (this.isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        int Top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;
        return Top;
    }

    @Override
    public Integer peek() {
        return this.value;
    }

    @Override
    public boolean isEmpty() {
        return this.previous == null;
    }

    @Override
    public int size() {
        return this.isEmpty() ? 0 : 1 + this.previous.size();
    }

    @Override
    public int search(Object o) {
        int count = 0;

        for(Stack<T> stack = this; !stack.isEmpty(); stack = stack.previous) {
            if (stack.value.equals(o)){
                return count;
            }
            count++;
        }
        return -1;
    }
    
}
