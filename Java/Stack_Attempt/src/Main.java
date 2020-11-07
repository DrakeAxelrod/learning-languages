public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());
        
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(16);

        System.out.println(stack.size());
    
    }
}