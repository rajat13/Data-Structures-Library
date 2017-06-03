public class ArrayStack<T> implements Stack<T>{
	private static final int CAPACITY = 5;
	private int top = -1;
	private T[] array;

	public ArrayStack(){
		this(CAPACITY);
		}

	public ArrayStack(int capacity){
		array = (T[])(new Object[capacity]);
		for(int i=0;i<capacity;i++)
			array[i] = null;
			}
	public void push(T item){
		if(top == array.length-1){
			T[] newArray = (T[])new Object[2*array.length];
			for(int i=0;i<array.length;i++){
				newArray[i] = array[i];
				}
			array=newArray;}
		array[++top] = item;
		}

	public T pop() throws RuntimeException{
		if(top<0){
			throw new RuntimeException("Stack is empty");}
		if(top<=array.capacity/4.0){
			T[] newArray = (T[]) new Object(array.capacity/4);	
			for(int i=0;i<=top;i++){
				newArray[i] = array[i];
				}
			array = newArray;
			}
		T temp = array[top--];
		array[top+1] = null;
		return temp;
		}

	public T top() throws RuntimeException{
		if(top<0){
			throw new RuntimeException("Stack is Empty");}
		return array[top];
		}

	public int size(){
		return top+1;
		}
	
	public boolean isEmpty(){
		return top==-1;
		}
	public int capacity(){
		return array.length;
		}

	public static void main(String[] args){
		ArrayStack<String> stack = new ArrayStack<String>();
		stack.push("hello");
		stack.push("ki");
		stack.push("gal");
		stack.push("22");
		stack.push("22");
		System.out.println(stack.capacity());
		stack.push("22");
		System.out.println(stack.capacity());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
		System.out.println(stack.size());
		stack.push("ki");
		stack.push("chahida");
		System.out.println(stack.size());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());

		}
	}
