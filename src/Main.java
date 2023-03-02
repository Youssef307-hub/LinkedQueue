public class Main {
    public static void main(String[] args) {

        LinkedQueue<Integer> myQueue = new LinkedQueue<>();

        System.out.println("Is queue empty? " + myQueue.empty());
        System.out.println("Adding items to the queue...");
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.elements();
        System.out.println("Is queue empty? " + myQueue.empty());
        System.out.println("Size: " + myQueue.getSize());
        System.out.println("Front: " + myQueue.getFront());
        System.out.println("Rear: " + myQueue.getRear());
        System.out.println("Before Clearing the queue\n");


        System.out.println("Clearing queue...");
        myQueue.clear();
        myQueue.elements();
        System.out.println("Is queue empty? " + myQueue.empty());
        System.out.println("Size: " + myQueue.getSize());
        System.out.println("Front: " + myQueue.getFront());
        System.out.println("Rear: " + myQueue.getRear());
        System.out.println("After Clearing the queue\n");


        System.out.println("Adding new items to the queue...");
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(8);
        myQueue.enqueue(9);
        myQueue.elements();
        System.out.println("Is queue empty? " + myQueue.empty());
        System.out.println("size: " + myQueue.getSize());
        System.out.println("Front: " + myQueue.getFront());
        System.out.println("Rear: " + myQueue.getRear());

        System.out.println("Removing the first 2 items...");
        System.out.println("The first removed item: " + myQueue.dequeue());
        System.out.println("The Second removed item: " + myQueue.dequeue());

        System.out.println("After removing the first 2 items...");
        myQueue.elements();
        System.out.println("size: " + myQueue.getSize());
        System.out.println("Front: " + myQueue.getFront());
        System.out.println("Rear: " + myQueue.getRear());


    }
}