package linear;

public class DynamicListDouble {
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
	private Node tail;
	private int count;
	
	public DynamicListDouble() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	/**
	* Add element at the end of the list
	* @param item - the element you want to add
	*/
	public void add(Object item) {
		if (head == null) {
			// We have empty list
			head = new Node(item);
			tail = head;
		} else {
			// We have non-empty list
			Node newNode = new Node(item, tail);
			newNode.prev = tail;
			tail = newNode;		
		}
		count++;
	}
	public int remove (Object item){
		// Find the element containing searched item
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if ((currentNode.element != null && currentNode.element.equals(item)) || (currentNode.element == null) && (item == null)){
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) {
			// Element is found in the list. Remove it
			count--;
			if (count == 0) {
				head = null;
				tail = null;
			} else if (prevNode == null) {
				head = currentNode.next;
				currentNode.next.prev = null;
			} else {
				prevNode.next = currentNode.next;
				currentNode.prev = prevNode.prev;
			}		
		return currentIndex;
		} else {
			// Element is not found in the list
			return -1;
		}
	}
	public Object remove(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		// Find the element at the specified index
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentIndex < index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		// Remove the element
		count--;
		if (count == 0) {
			head = null;
			tail = null;
		} else if (prevNode == null) {
			head = currentNode.next;
			currentNode.next.prev=null;
		} else {
			prevNode.next = currentNode.next;
			currentNode.prev = prevNode.prev;
		}
		return currentNode.element;
	}
	/**
	* Searches for given element in the list
	* @param item - the item you are searching for
	* @return the index of the first occurrence of
	* the element in the list or -1 when not found
	*/
	public int indexOf(Object item) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if ((current.element != null && current.element.equals(item)) || (current.element == null) && (item == null)) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	/**
	* Check if the specified element exist in the list
	* @param item - the item you are searching for
	* @return true if the element exist or false otherwise
	*/
	public boolean contains(Object item) {
		int index = indexOf(item);
		boolean found = (index != -1);
		return found;
	}
	/**
	* @param index � the position of the element [0 � count-1]
	* @return the object at the specified index
	* @exception IndexOutOfBoundsException - when index is invalid
	*/
	public Object elementAt (int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException ("Invalid index: " + index);
		}
		Node currentNode = this.head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.element;
	}
		/**
		 * @return the actual list length
		 */
	public int getLength() {
		return count;
	}
	
	public static void main(String[] args){
		DynamicListDouble shoppingList = new DynamicListDouble();
		shoppingList.add("Milk");		
		shoppingList.add("Bred");
		shoppingList.add("Sugar");		
		System.out.println(shoppingList.count);
		for (int i=0; i<shoppingList.getLength(); i++) {
			System.out.println(shoppingList.elementAt(i));
		}		
	}
}
