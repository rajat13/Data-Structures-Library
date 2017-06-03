public interface queue<T>{
	public void enqueue(T item);

	public T dequeue();

	public T first();
	
	public int size();

	public boolean isEmpty();

	}
