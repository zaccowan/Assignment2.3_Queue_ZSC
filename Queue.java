

/**
 * Generic Queue implemented using a linked list.
 * Uses node to store elements in the queue.
 * @author Zachary Cowan
 * @param <T> Generic type of data to store in Queue.
 * @version 9/29/2022
 * Fall/2022
 */
public class Queue<T> implements QueueInterface<T> {
	private Node<T> front = null;
	private Node<T> back = null;
	private int numInQueue = 0;
	
	/**
	 * Queue constructor.
	 */
	Queue() {
		this(null);
	}

	/**
	 * Queue constructor with option to initialize with one element already in the queue.
	 * @param newEntry The data to add to the queue.
	 */
	Queue(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry);
		
		if( isEmpty() ) {
			front = newNode;
			back = null;
			front.setNextNode(back);
		} else if( numInQueue == 1) {
			back = newNode;
			front.setNextNode(back);
			back.setNextNode(null);
		} else {
			back.setNextNode(newNode);
			back = back.getNextNode();
		}
		
		numInQueue += 1;
	}

	/**
	 * Add an item to the queue.
	 * Items are stored in FIFO fashion, so add to end of linked list.
	 * @param newEntry The data to add to the queue.
	 */
	public void enqueue(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry);
		
		if( isEmpty() ) {
			front = newNode;
			back = null;
			front.setNextNode(back);
		} else if( numInQueue == 1) {
			back = newNode;
			front.setNextNode(back);
			back.setNextNode(null);
		} else {
			back.setNextNode(newNode);
			back = back.getNextNode();
		}
		
		numInQueue += 1;
	}

	
	/**
	 * Remove an item from the top of the queue.
	 * @return Node The item removed from the queue.
	 * @throws EmptyQueueException When queue is already empty.
	 */
	public Node<T> dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		Node<T> dequeuedEntry = front;
		front = front.getNextNode();
		return dequeuedEntry;
	}

	/**
	 * Get the node at the top of the queue.
	 * @return Node The node at the top of the queue.
	 * @throws EmptyQueueException When queue is already empty.
	 */
	public Node<T> getFront() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		return front;
	}
	
	/**
	 * Get the node at the end of the queue.
	 * @return Node The node at the end of the queue.
	 */
	public Node<T> getBack() {
		return back;
	}

	/**
	 * Test to see if the queue is empty.
	 * @return True if no element exists in queue.
	 */
	public boolean isEmpty() {
		boolean isEmpty = false;
		if( front == null ) {
			isEmpty = true;
		}
		return isEmpty;
	}

	/**
	 * Remove all items from the queue.
	 */
	public void clear() {
		front.setNextNode(null);
		front = null;
		back = null;
		numInQueue = 0;
	}

	/**
	 * Get the number of items in the queue.
	 * @return int Number of items.
	 */
	public int getNumInQueue() {
		return numInQueue;
	}
	
	/**
	 * Print Items in queue with default formating.
	 */
	public void printQueue() {
		Node<T> currentNode = front;
		System.out.print("In Queue:\n");
		while (currentNode != null) {
			System.out.print("\t" + currentNode.getData() + "\n");
			currentNode = currentNode.getNextNode();
		}
	}
	
	/**
	 * Print Items in queue with desired message.
	 * @param message Message to present when printing.
	 */
	public void printQueue(String message) {
		Node<T> currentNode = front;
		System.out.print( message + "\n");
		while (currentNode != null) {
			System.out.print("\t" + currentNode.getData() + "\n");
			currentNode = currentNode.getNextNode();
		}
	}
	

	

}
