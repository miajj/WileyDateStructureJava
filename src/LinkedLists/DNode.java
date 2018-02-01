package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 */
public class DNode {

    private String element;
    private DNode prev;
    private DNode next;

    public DNode(DNode prev, String element, DNode next) {

        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

}
