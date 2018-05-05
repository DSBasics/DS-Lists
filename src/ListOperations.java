import java.util.Random;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList first = getListWithNNodes(10);
		
		System.out.println("Here is a random list of 10 integers: ");
		
		printList(first);		
		
	}

	private static void printList(MyList first) {
		while(first !=null) {
			System.out.print(first.getValue() + " --> ");
			first = first.getNext();
		}
		

		System.out.print("null ");
	}

	private static MyList getListWithNNodes(int n) {

		MyList first = null;
		
		for(int i = 0; i<n; ++i) {
			MyList node = new MyList();
			node.setValue((new Random()).nextInt(100));
			node.setNext(first);
			
			first = node;
			
		}
		
		return first;
	}

}
