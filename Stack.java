import java.util.*;


public class Stack<T> implements StackADT<T> {

    private int size;
    private Node first;

    private class Node {
	private T item;
	private Node next;
    }

    /**
     * Constructor
     */
    public Stack() {
	first = null;
	size = 0;
    }

    /** return true if this Stack is empty */
    public boolean isEmpty() {
	if (first == null) {
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
	Node oldFirst = first;
	first = new Node();
	first.item = item;
	first.next = oldFirst;
	size++;
    }

    /**
     * Returns the element from the top of Stack,
     * without removing it from the stack.
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T peek() throws EmptyStackException {
	if (isEmpty()) throw new EmptyStackException();
	return first.item;
    }

    /**
     * Returns and removes the element from the top of Stack,
     *
     * If the stack is empty, throws java.util.EmptyStackException
     */
    public T pop() throws EmptyStackException {
	if (isEmpty()) {
	    throw new EmptyStackException();
	} else {
	    T item = first.item;
	    first = first.next;
	    size--;
	    return item;
	}

    }

    public StackADT<T> reverse() {
	return null;
    }



}
