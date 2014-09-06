package linear;

public class QueueStatic {
	
	private Object[] arr;
	private int head;
	private int tail;
	private static final int INITIAL_CAPACITY = 4;
	/** Initializes the array-based list – allocate memory **/
	
	public QueueStatic() {
		arr = new Object[INITIAL_CAPACITY];
		head = 0;
		tail = -1;
	}
	/**
	* @return the actual list length
	*/
	public int getLength() {
		return (tail - head + 1);
	}
	/**
	* Adds element to the list
	* @param item - the element you want to add
	*/	
	/**
	* Inserts the specified element at given position in this list
	* * @param index -
	* index at which the specified element is to be inserted
	* @param item -
	* element to be inserted
	* @throws IndexOutOfBoundsException
	*/
	public void offer( Object item) {
		if ((tail + 1) == arr.length ){
			Object[] extendedArr = arr;
			extendedArr = new Object[arr.length * 2];
			System.arraycopy (arr, 0, extendedArr, 0, arr.length);
			tail++;
			extendedArr [tail] = item;
			arr = extendedArr; 
		} else {
			tail++;
			arr [tail] = item;
		}
	}	

	/**
	* Clears the list
	*/
	public void clear() {
		arr = new Object[0];
		head = 0;
		tail = -1;
	}
	/**
	* Checks if an element exists
	* @param item – the item to be checked
	* @return if the item exists
	*/
	public boolean contains(Object item) {
		if  (head > tail) {
			return false;
		} else if (item == null) {
			for (int i = head; i <= tail; i++) {
				if (arr[head] == null)
					return true;
			}
		}else {
			for (int i = head; i <= tail; i++)
					if (item.equals(arr[head]))
				return true;
		}
		return false;		
	}
	/**
	* @return the object on given position
	*/
	
	public Object poll() {
		if  (head > tail) {
			return "Array is empty";
		}
		Object item = arr[head];	
		arr[head] = null;
		head++;
		return item;
	}
	/**
	* Removes the specified item and returns its index or -1
	* if item does not exists
	* @param item - the item you want to remove
	*/
	public Object peek() {
		if  (head > tail) {
			return "Array is empty";
		}
		Object item = arr[head];		
		return item;
	}
	
	public static void main (String[] args){
		QueueStatic shoppingList = new QueueStatic();
		shoppingList.offer("Milk");
		shoppingList.offer("Milk");
		shoppingList.poll();
		System.out.print(shoppingList.contains(null));		
	}
}
	
	
