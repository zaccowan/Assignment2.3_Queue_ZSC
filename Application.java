/**
 * Application class to test Queue implementation.
 * @author Zachary Cowan
 * @version 9/29/2022
 * Fall/2022
 */
public class Application {
	public static void main(String [] args) {
		
		Queue<String> customerLine = new Queue<String>("Bill");
		customerLine.enqueue("Alice");
		customerLine.enqueue("Bob");
		customerLine.printQueue("Currently in line:");
		
		customerLine.dequeue();
		System.out.println("\nOne customer has been served...");
		
		customerLine.printQueue("Currently in line:");
		customerLine.enqueue("Jane");
		customerLine.enqueue("Hamad");
		System.out.println("\nTwo customers have joined the waitlist...");
		customerLine.printQueue("Currently in line:");
		
		customerLine.dequeue();
		customerLine.dequeue();
		System.out.println("\nTwo customers have been served...");
		customerLine.printQueue("Currently in line:");
		
		customerLine.enqueue("Jim");
		System.out.println("\nOne customer has joined the waitlist...");
		customerLine.printQueue("Currently in line:");
		
		customerLine.dequeue();
		customerLine.dequeue();
		System.out.println("\nTwo customers have been served...");
		customerLine.printQueue("Currently in line:");
	}
}
