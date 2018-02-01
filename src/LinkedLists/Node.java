package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 */
public class Node {

    private String item;
    private Node next;

    public Node(){
        this(null,null);
    }

    public Node(String item, Node next){
        this.item = item;
        this.next = next;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item='" + item + '\'' +
                ", next=" + next +
                '}';
    }
}
