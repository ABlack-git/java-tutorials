package tasks.datastructures;

public class CircularArrayQueue implements IQueue {
    private final int size;
    private final String[] array;

    public CircularArrayQueue(int size) {
        this.size = size;
        this.array = new String[size];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean enqueue(String element) {
        return false;
    }

    @Override
    public String dequeue() {
        return null;
    }

    @Override
    public void printAllElements() {

    }
}
