import java.util.Random;

public class SingleLinkedList {
	
	Node first;
	
	public SingleLinkedList(int numNodes) {

		for(int i = 0; i<numNodes; ++i) {
			Node node = new Node();
			node.setValue((new Random()).nextInt(100));
			node.setNext(first);
			
			first = node;			
		}
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	@Override
	public String toString() {

		String printStr = "";
		
		Node node = first;
		
		while(node !=null) {
			
			printStr += (node.getValue() + " --> ");
			node = node.getNext();
		}
		
		printStr += "null";
		
		return printStr;		
	}

}
