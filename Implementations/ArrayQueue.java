public class ArrayQueue<T> implements queue<T>{
	private int first,size;
	private T[] array;
	private static final int CAPACITY = 5;

	public ArrayQueue(){
		this(CAPACITY);
		}

	public ArrayQueue(int capacity){
		first =0;
		size = 0;
		array = (T[]) new Object[capacity];
		}


/*Making use of circular arrya using two pointers last--index last added item and recent---index of recently added item
	*/
	public void enqueue(T item) throws RuntimeException{
		if(size==array.length)
			throw new RuntimeException("Queue is full");
		int position = (first+size)%array.length;
		array[position] = item;
		size++;
		}

	public T dequeue() throws RuntimeException{
		if(size==0)
			throw new RuntimeException("Queue is empty");
		T ans = array[first];
		array[first] = null;
		size--;
		first = (first+1 )%array.length;
		return ans;}

	public int size(){
		return size;}

	public boolean isEmpty(){
		return size==0;}


	public T first(){
		if(size ==0){
			return null;
			}
		return array[first];}

	//Client testing code
	public static void main(String[] args){
		queue<String> queue = new ArrayQueue<String>();
		queue.enqueue("Hi");
		queue.enqueue("My");
		queue.enqueue("Name");
		queue.enqueue("Is");
		queue.enqueue("Rajat");
		System.out.println("This is a test run");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
			queue.enqueue("1");
		queue.enqueue("2");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		}
}
