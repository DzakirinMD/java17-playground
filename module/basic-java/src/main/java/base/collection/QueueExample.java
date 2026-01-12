package base.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * A queue is a linear data structure or a collection in Java that stores elements in a FIFO (First In, First Out) order.
 * This means that the element is inserted in the queue at the end and removed from the queue at the beginning.
 * <p>
 * The Deque is a queue that supports insertion and deletion from both the ends.
 * The deque is thread-safe.
 *
 * Managing requests: When requests are submitted to a system, they can be stored in a Queue and processed in the order they
 * were received. This ensures that each request is handled fairly and that none are missed or skipped.
 *
 * Message processing: In messaging systems, messages can be added to a Queue and processed by different parts of the system
 * in a coordinated manner. For example, a Queue can be used to manage incoming messages to a chat application, ensuring that
 * each message is delivered to the intended recipient in the correct order.
 *
 * Event processing: In systems that handle events, such as notifications or alerts, a Queue can be used to manage the events
 * and ensure that they are processed in the correct order. This can be especially useful when events occur at a high rate
 * and need to be handled efficiently.
 */
public class QueueExample {

    public void linkedListQueue() {
        System.out.println("=== linkedListQueue ===");
        // Creating a LinkedList with Integer elements
        Queue<Integer> queueLinkedList = new LinkedList<>();

        //Add elements to the Queue
        queueLinkedList.add(10);
        queueLinkedList.add(20);
        queueLinkedList.add(30);
        queueLinkedList.add(40);
        queueLinkedList.add(50);
        System.out.println("Elements in Queue:" + queueLinkedList);

        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: " + queueLinkedList.remove());

        //element() => returns head of the queue
        System.out.println("Head of the queue: " + queueLinkedList.element());

        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: " + queueLinkedList.poll());

        //returns head of the queue
        System.out.println("peek():Head of the queue: " + queueLinkedList.peek());

        //print the contents of the Queue
        System.out.println("Final Queue:" + queueLinkedList);
    }

    public void priorityQueue() {
        System.out.println("\n=== PriorityQueue ===");
        // Creating a PriorityQueue with Integer elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        System.out.println("Elements in priorityQueue:" + priorityQueue);

        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: " + priorityQueue.remove());

        //element() => returns head of the queue
        System.out.println("Head of the queue: " + priorityQueue.element());

        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: " + priorityQueue.poll());

        //returns head of the queue
        System.out.println("peek():Head of the queue: " + priorityQueue.peek());

        //print the contents of the Queue
        System.out.println("Final Queue:" + priorityQueue);
    }
}
