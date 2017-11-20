import java.util.*;

public class Queue<T> implements QueueADT<T> {

    private LinkedList<T> items;

    public Queue() {
	items = new LinkedList<T>();
    }


    /**
     * Return true if the Queue is empty
     */
    public boolean isEmpty() {
	return items.isEmpty();
    }

    /**
     * Add data to the rear of the Queue,
     *  throws IllegalArgumentException when data is null
     */
    public void enqueue(T data) throws IllegalArgumentException {
	if (data == null) {
	    throw new IllegalArgumentException();
	}
	items.add(items.size() + 1, data);
    }


    /**
     * Return and remove the next item (from the front) of the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException {
	if (this.isEmpty()) {
	    throw new EmptyQueueException();
	}
	items.remove(0);
	return items.get(items.size() - 1);
    }

    /**
     * Get and do not remove the next item in the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T element() throws EmptyQueueException {
	if (this.isEmpty()) {
	    throw new EmptyQueueException();
	}
	return items.get(items.size() - 1);
    }

}
