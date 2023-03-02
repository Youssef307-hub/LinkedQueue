public class Node<T> {
    private T item;
    private Node next;

    Node(){
        this.item = null;
        this.next = null;
    }

    public T getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
