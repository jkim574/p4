import java.util.*;

public class Queue<T> implements QueueADT<T> {

    private Node front, rear; //begin and end nodes
    private int size; // number of items

    private class Node {
	private T item;
	private Node next;
    }

    public Queue() {
	front = null;
	rear = null;
	size = 0;
    }


    /**
     * Return true if the Queue is empty
     */
    public boolean isEmpty() {
	if (size == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * Add data to the rear of the Queue,
     *  throws IllegalArgumentException when data is null
     */
    public void enqueue(T data) throws IllegalArgumentException {
	if (data == null) {
	    throw new IllegalArgumentException();
	}
	Node oldRear = rear;
	rear = new Node();
	rear.next = null;
	if (isEmpty()) {
	    front = rear;
	} else {
	    oldRear.next = rear;
	}
	size++;
    }


    /**
     * Return and remove the next item (from the front) of the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException {
	if (size == 0) {
	    throw new EmptyQueueException();
	}
	T item = front.item;
	front = front.next;
	if (isEmpty()) {
	    rear = null;
	}
	size--;
	return item;
    }

    /**
     * Get and do not remove the next item in the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T element() throws EmptyQueueException {
	if (size == 0) {
	    throw new EmptyQueueException();
	}
	T item = front.item;
	front = front.next;
	return item;
    }

}
