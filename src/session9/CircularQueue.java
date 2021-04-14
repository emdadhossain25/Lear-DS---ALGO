package session9;

public class CircularQueue {
    int[] data;
    int front, end;
    int size; // no need to add additional condition for checking
    private final int DEFAULT_SIZE = 10;

    CircularQueue() {
        data = new int[DEFAULT_SIZE];
        front = 0;
        end = -1;
        size = 0;

    }

    CircularQueue(int initialSize) {
        data = new int[initialSize];
        front = -1;
        end = -1;
        size = 0;

    }


    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        this.end = (end + 1) % data.length; // for rotation like end = 1%5 =1
        this.data[end] = item;
        size++;
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("Queue is full");
            return null;
        }
        int temp = data[front];
        this.front = (front + 1) % data.length; // changing the front
        size--; // reducing the size
        return temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
