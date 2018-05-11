import java.util.Random;

public class ListOperations {

	public static void main(String[] args) {

		System.out.println("Single linked list operations...");
		SingleLinkedListOperations();		
		
		System.out.println("Doubly linked list operations...");
		DoublyLinkedListOperations();
	}

	private static void SingleLinkedListOperations() {
		SingleLinkedList myList = new SingleLinkedList(10);
				
		System.out.println("Here is a random list of 10 integers: " + myList);		
		
		SingleLinkedList reversedLL = reverseLinkedList(myList);
		
		System.out.println("Reversed Linked List: " + reversedLL);	
		
		reversedLL = reverseLinkedListRecursive(myList);
		
		System.out.println("Reversed Linked List: " + reversedLL);
	}
	
	private static SingleLinkedList reverseLinkedList(SingleLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}

	private static SingleLinkedList reverseLinkedListRecursive(SingleLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void DoublyLinkedListOperations() {
		DoublyLinkedList myList = new DoublyLinkedList(10);
				
		System.out.println("Here is a random Doubly Linked list of 10 integers: " + myList);		
		
		DoublyLinkedList reversedLL = reverseDoublyLinkedList(myList);
		
		System.out.println("Reversed Doubly Linked List: " + reversedLL);	
		
		reversedLL = reverseDoublyLinkedListRecursive(myList);
		
		System.out.println("Reversed Doubly Linked List: " + reversedLL);
	}

	private static DoublyLinkedList reverseDoublyLinkedList(DoublyLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}

	private static DoublyLinkedList reverseDoublyLinkedListRecursive(DoublyLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}

	




}
