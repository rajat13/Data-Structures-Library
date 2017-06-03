public interface deque<T> {
	
	public void addFront(T item);

	public T removeFront();

	public void addLast(T item);

	public T removeLast();

	public boolean isEmpty();

	public int size();

	public T first();

	public T last();

	}
