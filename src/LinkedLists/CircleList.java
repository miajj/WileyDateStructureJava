package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 */

/** Circulary linked list with nodes of type Node storing strings. */
public class CircleList {
    protected Node cursor;	// the current cursor
    protected int size;	        // the number of nodes in the list
    /** Constructor that creates and empty list */
    public CircleList() { cursor = null; size = 0; }
    /** Returns the current size */
    public int size() { return size; }
    /** Returns the cursor */
    public Node getCursor() { return cursor; }
    /** Moves the cursor forward */
    public void advance() { cursor = cursor.getNext(); }
    /** Adds a node after the cursor  */
    public void add(Node newNode) {
        if (cursor == null) {    // list is empty
            newNode.setNext(newNode);
            cursor = newNode;
        }
        else {
            newNode.setNext(cursor.getNext());
            cursor.setNext(newNode);
        }
        size++;
    }
    /** Removes the node after the cursor */
    public Node remove() {
        Node oldNode = cursor.getNext();	// the node being removed
        if (oldNode == cursor)
            cursor = null; // list is becoming empty
        else {
            cursor.setNext(oldNode.getNext());	// link out the old node
            oldNode.setNext(null);
        }
        size--;
        return oldNode;
    }
    /** Returns a string representation of the list, starting from the cursor */
//    public String toString() {
//        if (cursor == null) return "[]";
//        String s = "[..." + cursor.getElement();
//        Node oldCursor = cursor;
//        for (advance(); oldCursor != cursor; advance())
//            s += ", " + cursor.getElement();
//        return s + "...]";
//    }
}