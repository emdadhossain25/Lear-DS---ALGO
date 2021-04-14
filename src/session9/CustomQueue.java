package session9;


/*
this custom queue actually does a little more then just adding and removing from the list
it shifts the removed item so that we can use the empty space
 */
public class CustomQueue {

    protected int end; //declaring the last index
    protected int[] data; // list of ints for FIFO operation
    private static final int DEFAULT_SIZE = 10; // default size for the queue


    //    default constructor

    public CustomQueue() {
        end = -1;
        data = new int[DEFAULT_SIZE];
    }

    /**
     * THERE ARE
     * TWO OPERATION
     * NEEDED FOR
     * CUSTOM QUEUE
     */
    //    declaring a constructor with dynamic value like 100 0r 1000 ints from user
    public CustomQueue(int size) {
        end = -1;
        data = new int[size];
    }

    public boolean isFull() {
        return end == this.data.length - 1; //checking whether the value is last index of the data array
    }

    public boolean isEmpty() {
        return end == -1; //checking whether the data array is empty when we remove any item
    }

    public void add(int item) {
//currently if the end index is somewhere in -1 or anywhere else then we have to increment the index of end
        if (isFull())//  whether the queue is full or not
        {
            System.out.println("Queue is full");
            return;
        }
        this.data[++end] = item; // here this defines the class 'data' variale but before that we have to check
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        // returning the deleted item using this below value
        int temp = this.data[0];
        for (int i = 0; i < end; i++) {
            this.data[i] = this.data[i + 1];
        }
        return temp;
    }

}

