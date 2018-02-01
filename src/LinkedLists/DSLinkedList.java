package LinkedLists;

/**
 * Created by mia on 25/01/2018.
 * eliminate the need to traverse the list to get to the node just before the tail.
 */
public class DSLinkedList {

    protected DNode header;
    protected long size;
    protected DNode trailer;


    public DSLinkedList() {
        this.header = new DNode(null,null,null);
        this.size = 0;
        this.trailer = new DNode(null,null,null);
        header.setNext(trailer);
    }

    public long size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public DNode getFirst() throws IllegalStateException{
        if(isEmpty()) throw new IllegalStateException("List is Empty");
        return header.getNext();
    }

    public DNode getLast() throws IllegalStateException{
        if(isEmpty()) throw new IllegalStateException("List is Empty");
        return trailer.getPrev();
    }

    /** Returns the node before the given node v. An error occurs if v
     * is the header */
    public DNode getPrev(DNode v) throws IllegalArgumentException {
        if (v == header) throw new IllegalArgumentException
                ("Cannot move back past the header of the list");
        return v.getPrev();
    }
    /** Returns the node after the given node v. An error occurs if v
     * is the trailer */
    public DNode getNext(DNode v) throws IllegalArgumentException {
        if (v == trailer) throw new IllegalArgumentException
                ("Cannot move forward past the trailer of the list");
        return v.getNext();
    }

    // add z before v
    public void addBefore(DNode v, DNode z) throws IllegalArgumentException{
        DNode u = getPrev(v);
        z.setPrev(u);
        z.setNext(v);
        u.setNext(z);
        v.setPrev(z);
        size ++;
    }

    public void addAfter(DNode v, DNode z){
        DNode u = getNext(v);
        z.setPrev(v);
        z.setNext(u);
        v.setNext(z);
        u.setPrev(z);
        size ++;
    }

    public void addFirst(DNode z){
        addAfter(header,z);
    }

//    public void addFirst(String item){
//
//        DNode dnode = new DNode(null,item,null);
//
//        if(size == 0){
//            dnode.setPrev(header);
//            dnode.setNext(trailer);
//            header.setNext(dnode);
//            trailer.setPrev(dnode);
//
//        }else {
//            DNode temp = header.getNext();
//            dnode.setPrev(header);
//            dnode.setNext(temp);
//            header.setNext(dnode);
//            temp.setPrev(dnode);
//        }
//        size ++;
//    }

    public void remove(DNode v){
        DNode p = v.getPrev();
        DNode n = v.getNext();
        p.setNext(n);
        n.setPrev(p);
        v.setNext(null);
        v.setPrev(null);
        size--;
    }

    public boolean hasPrev(DNode v){return v!=header;}

    public boolean hasNext(DNode v){return v!=trailer;}

    public void removeLast(){
        if(size == 0) {
            System.out.println("Empty list");
        }else {
            DNode temp = trailer.getPrev();
            DNode lastTarget = temp.getPrev();
            trailer.setPrev(lastTarget);
            lastTarget.setNext(trailer);
            temp.setPrev(null);
            temp.setNext(null);
        }
        size --;
    }


    public void InsertionSort(){
        DNode move = header.getNext().getNext();
        for (int i = 1; i < size; i++){
            DNode temp = move.getNext();
            DNode previous = move.getPrev();
            while((previous.getPrev()!=null)&& previous.getElement().compareTo(move.getElement())>0) {
                previous = previous.getPrev();
            }
            remove(move);
            addAfter(previous,move);
            move = temp;
        }

    }

    public static void main(String[] args) {
        DSLinkedList dsl = new DSLinkedList();
        DNode M = new DNode(null,"M",null);
        DNode D = new DNode(null,"D",null);
        DNode J = new DNode(null,"J",null);
        DNode A = new DNode(null,"A",null);
        DNode Z = new DNode(null,"Z",null);
        dsl.addFirst(J);
        dsl.addFirst(A);
        dsl.addFirst(D);
        dsl.addFirst(M);
        dsl.addFirst(Z);
        dsl.InsertionSort();
    }

}
