
/* Api for Stack Abstract data type */
public interface Stack<E>{
	
/* Push method will push an object of formal type E To the top of stack,If stack is full it will throw an Runtime Exception*/ 	
	public void push(E e);
/* pop method will remove the topmost element of stack ,if stack is empty it will return null*/		
	public E pop();
/* top method will return the top elemnt of stack without removing it from stack,  if empty stack, it will return null*/	
	public E top();
/* Size method will return the current number of elements on stack */
	public int size();
/* isEmpty method will return a boolean value indicating whether the stack is empty or not*/
	public boolean isEmpty();

	}
