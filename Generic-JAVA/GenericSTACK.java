import java.util.Stack;

public class GenericSTACK<T> {
    Stack<T> stack = new Stack<>();

    // Constructor
    public GenericSTACK() {}

    // Method to push elements onto the stack
    public void push(T t) {
        stack.push(t);
    }

    // Method to pop elements from the stack
    public T pop() {
        return stack.pop();
    }

    public static void main(String[] args) {
        // Create an instance of GenericSTACK
        GenericSTACK<Object> stack = new GenericSTACK<>();

        // Push elements onto the stack
        stack.push(2);
        stack.push(2.2);
        stack.push("String");

        // Pop and print elements from the stack
        System.out.println(stack.pop());//Thes will print String...
        System.out.println(stack.pop()); // This will print 2.2..
        System.out.println(stack.pop()); // This will print 2.
    }
}
