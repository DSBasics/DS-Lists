import java.util.Random;

public class DoublyLinkedList {

	DLLNode head;
	DLLNode tail;
	
	public DLLNode getTail() {
		return tail;
	}

	public void setTail(DLLNode tail) {
		this.tail = tail;
	}

	public DoublyLinkedList(int numNodes) {

		DLLNode prev = null;
		
		for(int i = 0; i<numNodes; ++i) {
			DLLNode node = new DLLNode();
			node.setValue((new Random()).nextInt(100));
			node.setLeft(prev);
			if(prev !=null) prev.setRight(node);
			
			if(i == 0) head = node;
			
			tail = prev = node; 			
		}
	}

	public DLLNode getHead() {
		return head;
	}

	public void setHead(DLLNode first) {
		this.head = first;
	}

	@Override
	public String toString() {

		String printStr = "";
		
		DLLNode node = head;
		
		while(node !=null) {
			
			printStr += (node.getValue() + " <--> ");
			node = node.getRight();
		}
		
		printStr += "null";
		
		return printStr;		
}
}
