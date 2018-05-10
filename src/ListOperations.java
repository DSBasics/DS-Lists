import java.util.Random;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList myList = new SingleLinkedList(10);
				
		System.out.println("Here is a random list of 10 integers: " + myList);		
		
		SingleLinkedList reversedLL = reverseLinkedList(myList);
		
		System.out.println("Reversed Linked List: " + reversedLL);	
		
		reversedLL = reverseLinkedListRecursive(myList);
		
		System.out.println("Reversed Linked List: " + reversedLL);	
		
	}

	private static SingleLinkedList reverseLinkedListRecursive(SingleLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}

	private static SingleLinkedList reverseLinkedList(SingleLinkedList myList) {
		// TODO Auto-generated method stub
		return null;
	}




}
