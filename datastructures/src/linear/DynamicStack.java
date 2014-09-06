package linear;

public class DynamicStack {
	/**
	* Represents dynamic list implementation
	* @author Tsvyatko Konov
	* @author Svetlin Nakov
	*/
	private class Node{
		Object element;
		Node next;
		Node prev;
		Node(Object element, Node prevNode) {
			this.element = element;	
			prevNode.next = this;
			next=null;
			
		}
		Node(Object element) {
			this.element = element;
			next = null;
			prev = null;
		}
	}
	private Node head;
	private Node top;
	private int count;
	
	public DynamicStack() {
		this.head = null;
		this.top = null;
		this.count = 0;
	}
	/**
	* Add element at the end of the list
	* @param item - the element you want to add
	*/
	public void push(Object item) {
		if (head == null) {
			// We have empty list
			head = new Node(item);
			top = head;
		} else {
			// We have non-empty list
			Node newNode = new Node(item, top);
			newNode.prev = top;
			top = newNode;
	
		}
		count++;
	}
	public Object pop () {		
		if (this.top == null) {
			System.out.println("Stack is empty.");
			return null;
		}
		count--;
		Object toReturn =top.element;
		top = top.prev;
		//top.prev.next=null;
		return toReturn;
	}
	public Object peek() {
		if (this.top == null) {
			System.out.println("Stack is empty.");
			return null;
		}		
		return top.element;			
	}
	public void clear () {
		while (count>0){
			pop();
		}
	}
	public String contains(String searchItem) {
		String returnItem="Object not found";
		while (count>0){
			if(pop().toString()==searchItem){
				returnItem=searchItem;
			}			
		}
		return returnItem;
	}
	//public boolean contains(Object item) {
	//	int index = indexOf(item);
	//	boolean found = (index != -1);
	//	return found;
	//}	

	/**
	* @param index – the position of the element [0 … count-1]
	* @return the object at the specified index
	* @exception IndexOutOfBoundsException - when index is invalid
	*/
	
		/**
		 * @return the actual list length
		 */
	public int getLength() {
		return count;
	}
	public static void main(String[] args){
		DynamicStack shoppingList = new DynamicStack();
		shoppingList.push("Milk");
		shoppingList.push("Honey");
		shoppingList.push("Olives");
		shoppingList.push("Beer");		
		System.out.println(shoppingList.contains("Milk"));
		
	}

}
