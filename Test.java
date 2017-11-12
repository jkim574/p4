public class Test {
    public static void main(String[] args) {
	Stack<Integer> st = new Stack<Integer>();
	Queue<Integer> qu = new Queue<Integer>();

	//	System.out.println(st.isEmpty());
	//	st.push(1);
	//	st.push(4);
	//	st.push(2);
	//	System.out.println(st.pop());
	//	System.out.println(st.peek());



	System.out.println(qu.isEmpty());
	qu.enqueue(1);
	qu.enqueue(2);
	qu.enqueue(5);
	qu.enqueue(10);
	qu.display();
	qu.dequeue();
	System.out.println(qu.element());
    }
}
