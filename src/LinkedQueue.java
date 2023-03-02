public class LinkedQueue<T> {
    /**
     * Front refers to the Node at the beginning of the queue, where we remove items from the queue
     */
    private Node<T> front;

    /**
     * Rear refers to the Node at the end of the queue, where we add items to the queue
     */
    private Node<T> rear;

    /**
     * Size refers to the size of the queue
     */
    private int size;

    LinkedQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    /**
     * Method checks whether the queue is empty or not by checking if the rear Node is null as if we removed the last
     * item from the queue, then this queue must be empty!
     * @return Boolean value refers to queue emptiness or not
     */
    public boolean empty(){
        return (this.rear == null);
    }

    /**
     * Method to add items to the end of the queue by making an object of Node type and assigning the element passed as
     * a parameter to the method to the node then connect the new node with the latest added node and make the next to
     * this new node a null, as it will be the last node in the queue.
     * Before connecting the node to the rest of the nodes it checks whether the queue is empty or not, as if it is empty
     * the new node will be the only node in the queue which will be the front and the rear node at the same time, else,
     * it will be connected to the rear node and the new node will be the rear node.
     * @param element It is the element to be added to the queue of any data type.
     */
    public void enqueue(T element){
        Node<T> newNode = new Node<>();
        newNode.setItem(element);
        newNode.setNext(null);
        this.size++;
        if(empty()){
            this.front = this.rear = newNode;
        }else {
            this.rear.setNext(newNode);
            this.rear = newNode;
        }
    }

    /**
     * Method to remove element from the front of the queue, first it checks if the front is equal to rear, which means
     * it has two cases. The first case the queue contains only 1 item, then it will assign both the front and the rear to null.
     * The second case the queue doesn't contain any items (both front and rear equals to null), then it will return null.
     * Else, the queue contains more than 1 item, it removes the front node and make the next node the new front.
     * @return Null if the queue is empty or the removed item if the queue is not empty
     */
    public T dequeue(){
        if(this.front == this.rear){
            // Case of only 1 item in the queue
            if(!empty()){
                T removedItem = this.front.getItem();
                this.front = this.rear = null;
                this.size--;
                return removedItem;

            // Case of no items in the queue
            }else
                return null;

        // Case of the queue contains more than 1 item
        }else {
            T removedItem = this.front.getItem();
            this.front = this.front.getNext();
            this.size--;
            return removedItem;
        }
    }

    /**
     * Method to display the elements inside the queue by making a temporary nodes to hold the front and the rear nodes,
     * in order not to manipulate with the original values, and if the queue is not empty, while the front node and
     * the rear nodes are not equal it will print the front item and assign the front node to the next node, but this means
     * if both the front and rear nodes are equal as in the case of having only 1 item in the queue this will not be included in our
     * loop, so it got printed separately outside the loop.
     */
    public void elements(){
        Node<T> tempFront = this.front;
        Node<T> tempRear = this.rear;
        if (!empty()){
            System.out.print("[ ");
            while(tempFront != tempRear){
                System.out.print(tempFront.getItem() + ", ");
                tempFront = tempFront.getNext();
            }
            System.out.print(tempRear.getItem() + " ");
            System.out.println("]");
        }else
            System.out.println("Queue is Empty!");
    }

    /**
     * Method to clear the queue node by node, it applies the dequeue method with the logic of the elements method
     */
    public void clear(){
        if (!empty()){
            while(this.front != this.rear){
                this.front = this.front.getNext();
                this.size--;
            }
            this.rear = this.front = null;
            this.size--;
        }else
            System.out.println("Queue is Empty!");
    }

    /**
     * Method to print the front item
     * @return Front item value of any data type
     */
    public T getFront(){
        if(!empty())
            return this.front.getItem();

        return null;
    }

    /**
     * Method to print the rear item
     * @return Rear item value of any data type
     */
    public T getRear(){
        if(!empty())
            return this.rear.getItem();

        return null;
    }

    /**
     * Method to get the size of the queue
     * @return Size of the queue
     */
    public int getSize(){
        return size;
    }
}
