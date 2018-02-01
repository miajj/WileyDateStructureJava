package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 */
public class SLinkedList {
    protected Node head;
    protected long size;

    public SLinkedList(String x) {
        this.head = new Node(x,null);
        //this.tail = null;
        this.size = 1;

    }

    public SLinkedList(int x){

    }

    public void addFirst(String item){
        Node node = new Node(item,head);
        this.head = node;
        size ++;
    }

    public String getFirst(){
        return head.getItem();
    }


    //traverse the list to get to the tail.
    public void addLast(String item){
        Node node = new Node(item,null);
        Node p = head;
        while(p.getNext()!= null){
            p = p.getNext();
        }
        // now P == tail
        p.setNext(node);
        size ++;
    }

    public void removeFirst() {
//        if (head == null)
//            System.out.println("This list is empty.");
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
    }



    public static void main(String[] args) {
        SLinkedList sl = new SLinkedList("10");
        sl.addFirst("30");
        sl.addFirst("20");
        sl.addLast("40");
        sl.removeFirst();
    }
}