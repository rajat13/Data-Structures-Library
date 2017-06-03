public class SList<T>{	

		private class SListNode<k>{
		private k item;
		private SListNode<k> next;
		
		private SListNode(k item,SListNode<k> next){
			this.item = item;
			this.next = next;
			}
		private SListNode(){  }
		}

	
	private SListNode<T> head ;
	private int size;
	

	public SList(){
		this.head = null;
		this.size = 0;
		}


	public boolean insert( T item, int position ) throws RuntimeException{
		if(position >=1 && position <= this.size+1){
			if(position == 1){
				SListNode<T> newNode = new SListNode<T>(item,this.head);
				head = newNode;
				size++;
				return true;
				}
			else{
				SListNode<T> temp =head;
				for(int i=0 ; i<position-2 ; i++){
					temp = temp.next;
					}
				SListNode<T> newNode =new SListNode<T>(item ,temp.next);
				temp.next = newNode;
				size++;
				return true;
				}
			}
		else throw new RuntimeException("Index out of bounds"); 
		}


	public T remove(int position) throws RuntimeException{
		if(this.size == 0){
			throw new RuntimeException("Empty list");
			}
		if(position >=1 && position<=this.size){
			if(position ==1){
				T returnValue = head.item;
				head = head.next ;
				size--;
				return  returnValue;
				}
			else{
				SListNode<T> temp = head;
				for(int i=0;i<position-2;i++){
					temp = temp.next;
					}
				T returnValue = temp.next.item;
				temp.next = temp.next.next;
				size--;
				return returnValue;
				}
			}
		else {throw new RuntimeException("Index out of bounds");
			}
		}


	public int search(T item) throws RuntimeException{
		if(this.size ==0){
			throw new RuntimeException("Empty list");
			}
		SListNode<T> temp = head;
		for(int i=0; i<this.size ;i++){
			if(temp.item == item){
				return i+1;
				}
			temp = temp.next;
			}
		return -1;		
		}


	public T element(int position) throws RuntimeException{
	if(this.size==0){
		throw new RuntimeException("Empty list");
		}		
	if(position>=1 && position<=this.size){	
		SListNode<T> temp = head;
		for(int i=0 ; i< position -2;i++){
			temp = temp.next;
			}
		return temp.item;
		}
	else {throw new RuntimeException("Index out of bounds");
			}
	}


	
	public void reverse(){
		if(head!=null){		
			SListNode<T> prev = null,current = head , Next = head.next;
			while(Next != null){	
				current.next = prev;
				prev = current;
				current = Next;	
				Next  = current.next;			
				}
			current.next = prev;			
			head = current;
			}
		}
	public void reverse2(){
		if(head !=null){
			SListNode<T> first = head,current = head.next,temp = null;
			while(current != null){
				temp = current.next;
				current.next = head;
				head = current;
				current = temp;
				}
			first.next = null;
			}
		}


	public boolean addFront(T item){
		return insert(item,1);
		}
	public boolean addLast(T item){
		return insert(item,this.size+1);
		}
	public T removeFront(){
		return remove(1);
		}
	public T removeLast(){
		return remove(this.size);
		}
	public boolean removeGiven(T item){
		int index = search(item);
		if(index>0){
			remove(index);
			return true;
			}
		else return false;
		}
	public boolean isEmpty(){
		return this.size ==0;
		}
	public int size(){
		return this.size;
		}
	public T first(){
		return element(1);
		}
	public T last(){
		return element(this.size);
		}
	public void printList(SListNode<T> tempNode){
		while(tempNode.next!= null){
			System.out.print(tempNode.item+"-->");
			tempNode = tempNode.next;
			}
		System.out.println(tempNode.item);
		}	

	public static void main(String[] args){
		SList<Integer> list1 = new SList<Integer>();
		list1.addLast(1);
		list1.addLast(2);
		list1.addLast(3);
		list1.addLast(4);
		list1.addLast(5);
		list1.addLast(6);
		list1.addLast(7);
		list1.printList(list1.head);
		list1.reverse2();
		list1.printList(list1.head);
		}
}
	
