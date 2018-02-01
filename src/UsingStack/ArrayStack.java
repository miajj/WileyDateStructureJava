package UsingStack;

//import java.util.Stack;

import java.util.Arrays;

/**
 * Implementation of the stack ADT using a fixed-length array.  An
 * exception is thrown if a push operation is attempted when the size
 * of the stack is equal to the length of the array.  This class
 * includes the main methods of the built-in class java.util.Stack.
 */
public class ArrayStack<E> implements Stack<E> {

    protected static int CAPACITY = 1000; //default array capacity
    protected int capacity;
    protected int t = -1;
    protected E[] S;


    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        S = (E[])new Object[capacity];
    }

    public int size() {
        return t+1;
    }
    public boolean isEmpty() {
        return (t<0);
    }
    public void push(E element) throws FullStackException {
        if (size() == capacity)
            throw new FullStackException("The stack is full.");
        S[++t] = element;
    }
    public E top() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException("The stack is empty.");
        return S[t];

    }
    public E pop() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException("The stack is empty.");
        E element = S[t];
        S[t--] = null;
        return element;
    }

    public String toString() {
        String s = "[";
        for(E element : S){
            if (element != null)
                s += (element +",");
        }
        s += "]";
        return s;
    }
    //  Prints status information about a recent operation and the stack.
    public void status(String op, Object element) {
        System.out.print("------> " + op);   // print this operation
        System.out.println(", returns " + element); // what was returned
        System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
        System.out.println(", stack: " + this);       // contents of the stack
    }


    public static <E> void reverse(E[] a){
        Stack<E> S = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; i++){
            S.push(a[i]);
        }
        for(int i = 0; i < a.length; i++){
            a[i] = S.pop();
        }
    }


    /**
     * Test our program by performing a series of operations on stacks,
     * printing the operations performed, the returned elements and the
     * contents of the stack involved, after each operation.
     */
    public static void main(String[] args) {
        Object o;
        ArrayStack<Integer> A = new ArrayStack<Integer>();
        A.status("new ArrayStack<Integer> A", null);
        A.push(7);
        A.status("A.push(7)", null);
        o = A.pop();
        A.status("A.pop()", o);
        A.push(9);
        A.status("A.push(9)", null);
        o = A.pop();
        A.status("A.pop()", o);
        ArrayStack<String> B = new ArrayStack<String>();
        B.status("new ArrayStack<String> B", null);
        B.push("Bob");
        B.status("B.push(\"Bob\")", null);
        B.push("Alice");
        B.status("B.push(\"Alice\")", null);
        o = B.pop();
        B.status("B.pop()", o);
        B.push("Eve");
        B.status("B.push(\"Eve\")", null);

        Integer[] a = {4, 8, 15, 16, 23, 42};  // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Boone"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));


    }
}