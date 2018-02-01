package UsingStack;

/**
 * Created by mia on 28/01/2018.
 */
public class NodeStack<E> implements Stack<E>{
    protected Node<E> top;
    protected int size;

    public NodeStack() {
        this.top = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }
    /**
     * Return whether the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty(){
        return size()<1;
    }
    /**
     * Inspect the element at the top of the stack.
     * @return top element in the stack.
     * @exception EmptyStackException if the stack is empty.
     */
    public E top() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("Empty list.");
        return top.getItem();
    }
    /**
     * Insert an element at the top of the stack.
     * @param element to be inserted.
     */
    public void push (E element){
        Node<E> newNode = new Node<>(element,top);
        top = newNode;
        size++;
    }
    /**
     * Remove the top element from the stack.
     * @return element removed.
     * @exception EmptyStackException if the stack is empty.
     */
    public E pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException("Empty list.");
        Node<E> temp = top;
        top = top.getNext();
        size--;
        return temp.getItem();
    }


}
