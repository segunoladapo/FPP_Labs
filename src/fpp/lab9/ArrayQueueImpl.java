package fpp.lab9;

/**
 * Created by segun on 3/17/2018.
 */
public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int item) {
        arr[rear++] = item;
        size++;
    }

    public int deque() {
        int item;
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        else {
            item = arr[front++];
            size--;
        }
        return item;
    }

    public int peek() {
        int item;
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        else {
            item = arr[front];
        }
        return item;
    }

    public static void main(String... args){
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(2);
        System.out.println(arrayQueue.deque());
        System.out.println(arrayQueue.deque());
    }
}
