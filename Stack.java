import java.util.*;


public class Stack<T> implements StackADT<T> {

    private LinkedList<T> items;

    /**
     * Constructor
     */
    public Stack() {
	items = new LinkedList<T>();
    }

    /** return true if this Stack is empty */
    public boolean isEmpty() {
	return items.isEmpty();
    }

    /**
     * Add the data item to top of the Stack.
     * If data is null, throw IllegalArgumentException
     */
    public void push(T item) {
	if (item == null) {
	    throw new IllegalArgumentException();
	}
	items.add(0, item);
    }

    /**
     * Returns the element from the top of Stack,
     * without removing it from the stack.
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T peek() throws EmptyStackException {
	if (this.isEmpty()) throw new EmptyStackException();
	return items.get(0);
    }

    /**
     * Returns and removes the element from the top of Stack,
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T pop() throws EmptyStackException {
	if (this.isEmpty()) {
	    throw new EmptyStackException();
	} return items.remove(0);
    }

    /**
     * Creates a new Stack with the items of this stack
     * in the reverse order.
     * The items in this stack remain the same order.
     *
     * If this stack is empty, the reverse order stack is also empty.
     */
    public StackADT<T> reverse() {
	StackADT<T> newStack = new Stack<T>();
	while (!this.isEmpty()) {
	    newStack.push(this.pop());
	}
	return newStack;
    }
}
