public class Arraydeque<T> implements deque<T>{
	private int first,size;
	public static final int CAPACITY = 10;
	private T[] array;

	public Arraydeque(){
		this(CAPACITY);
		}

	public Arraydeque(int capacity){
		first = 0;
		array = (T[]) new Object[capacity];
		size = 0;
		}

	public void addFront(T item) throws RuntimeException{
		int n = array.length;		
		if(size == n)
			throw new RuntimeException("deque is full");
		first = (first - 1 + n)%n;
		array[first] = item;
		size++;
		}
		
	public T removeFront(){
		int n = array.length;
		if (size == 0){
			return null;
			}
		T ans = array[first];
		array[first] = null;
		first = (first+1)%n;
		size--;
		return ans;
		}

	public void addLast(T item){
		int n = array.length;
		if(size == n)
			throw new RuntimeException("deque is full");
		int position = (first+size)%n;
		array[position] = item;
		size++;
		}
	public T removeLast(){
		int n = array.length;
		if(size == 0)
			return null;
		int position = (first+size)%n; 
		T ans = array[position];
		array[position] = null;
		size--;
		return ans;
		}

	public boolean isEmpty(){
		return size==0;
		}

	public int size(){	
		return size;
	}
		
	public T first(){
		if(size==0)
			return null;
		return array[first];
		}
	
	public T last(){
		if(size==0)
			return null;
		int n = array.length;
		int position = (first+size)%n;
		return array[position];
		}
	public static void main(String[] args){
		deque<String> d = new Arraydeque<String>();
		d.addFront("Goyal");
		d.addFront("Rajat");
		d.addLast("Is");
		d.addLast("My");
		d.addLast("name");
		System.out.println(d.removeFront());
		System.out.println(d.removeFront());
		System.out.println(d.removeFront());
		System.out.println(d.removeFront());
		System.out.println(d.removeFront());
		}
	}
