public class Queue<T> implements QueueADT<T> {

    private static final int INITSIZE = 10;  // initial array size
    private T[] items; // the items in the queue
    private int numItems;   // the number of items in the queue
    private int frontIndex;
    private int rearIndex;

    public Queue() {
	items = (T[]) new Object[INITSIZE];
	numItems = 0;
	frontIndex = 0;
	rearIndex = 0;
    }


    /**
     * Return true if the Queue is empty
     */
    public boolean isEmpty() {
	if (numItems == 0) {
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
	if (items.length == numItems) {
	    T[] copy = (T[]) new Object[items.length * 2];
	    System.arraycopy(items, frontIndex, copy, frontIndex, items.length - frontIndex);
	    if (frontIndex != 0) {
		System.arraycopy (items, 0 , copy, items.length, frontIndex);
	    }
	    items = copy;
	    rearIndex = frontIndex + numItems - 1;
	}
	rearIndex = incrementIndex(rearIndex);
	items[rearIndex] = data;
	numItems++;
    }

    /**
     * Increase the index by one, and set the index to 0 if the index is at the
     * last index of the array
     *
     * @param index
     * @return the result number after the increase
     */
    private int incrementIndex(int index) {
	if (index == items.length - 1)
	    return 0;
	else {
	    return index + 1;
	}
    }


    /**
     * Return and remove the next item (from the front) of the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T dequeue() throws EmptyQueueException {
	if (numItems == 0) {
	    throw new EmptyQueueException();
	}
	T copy = items[frontIndex];
	numItems--;
	frontIndex = incrementIndex(frontIndex);
    	return copy;

    }

    /**
     * Get and do not remove the next item in the queue,
     *
     * If queue is empty, throw EmptyQueueException
     */
    public T element() throws EmptyQueueException {
	if (numItems == 0) {
	    throw new EmptyQueueException();
	}
	return items[numItems - 1];
    }


      //Test
    public void display() {
	for (T num : items) {
	    System.out.println(num);
	}
    }


}
