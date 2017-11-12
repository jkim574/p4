import java.util.EmptyStackException;

public class Stack<T> implements StackADT<T> {

    private static final int INITSIZE = 10; //initial array size
    private T[] items; // the items in the stack
    private int numItems; // the number of items in the stack

    /**
     * Constructor
     */
    public Stack() {
	items = (T[]) new Object[INITSIZE];
	numItems = 0;
    }

    /** return true if this Stack is empty */
    public boolean isEmpty() {
	if (numItems == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Add the data item to top of the Stack.
     * If data is null, throw IllegalArgumentException
     */
    public void push(T item) {
	if (item == null) {
	    throw new IllegalArgumentException();
	}
	if (items.length == numItems) {
	    T[] copy = (T[]) new Object[2 * items.length];
	    for (int i = 0; i < numItems; i++) {
		copy[i] = items[i];
	    }
	    items = copy;
	}
	items[numItems] = item;
	numItems++;
    }

    /**
     * Returns the element from the top of Stack,
     * without removing it from the stack.
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T peek() throws EmptyStackException {
	if (numItems == 0) {
	    throw new EmptyStackException();
	}
	return items[numItems - 1];
    }

    /**
     * Returns and removes the element from the top of Stack,
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T pop() throws EmptyStackException {
	if (numItems == 0) {
	    throw new EmptyStackException();
	} else {
	    numItems--;
	    return items[numItems];
	}

    }

    //Test
    public void display() {
	for (T num : items) {
	    System.out.println(num);
	}
    }

    public StackADT<T> reverse() {
	return null;
    }



}
