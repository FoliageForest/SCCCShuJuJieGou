package hw20230403;

public class MyQueueRef<E> {

    private Object[] array;
    private int head;
    private int tail;

    public MyQueueRef(int capacity) {
        this.array = new Object[capacity];
    }

    public boolean enqueue(E e) {
        array[tail] = e;
        int length = array.length;
        tail = (++tail) % length;
        if (tail == head) {
            // À©Èİ
            Object[] data = new Object[length * 2];
            int index = 0;
            int i = head;
            do {
                data[index++] = array[i];
                i = (++i) % length;
            } while (i != head);
            tail = length;
            head = 0;
            array = data;
        }
        return true;
    }

    public E dequeue() {
        if (head == tail) {
            return null;
        }
        E item = (E) array[head];
        array[head] = null;
        head = (++head) % (array.length);
        return item;
    }

}
