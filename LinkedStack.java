public class LinkedStack<T> implements Stack<T>{


/* Using adapter pattern by including private instance of a data structre and to implement the required functionality 
by modifying the methods of the hidden data structre */

	private SList<T> list = new SList<T>();
			


	public void push(T item){
			list.addFront(item);
			}

	public T pop() throws RuntimeException{
		if(list.size() == 0){
			throw new RuntimeException(" Stack is empty");
			}
		return list.removeFront();
		}

	public T top(){
		if(list.size() == 0){
			throw new RuntimeException(" Stack is empty");
			}
		return list.first();
		}

	public int size(){
		return list.size();
		}

	public boolean isEmpty(){
		return list.isEmpty();
		}

	public static void main(String[] args){
		Stack<Integer> stack = new LinkedStack<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());		
		System.out.println(stack.size());
		stack.push(9);
		stack.push(10);
		System.out.println(stack.size());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());

		}
}
