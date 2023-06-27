package hw20230403;

/*
public class MyQueueTeach<T> {
    final int minsize = 10;
    int queueSize = 0;
    Object[] data;
    private int front; // 第一个数据得索引值. 空队列时该值为 -1
    private int rear; // 最后一个数据的下一个索引. 空队列时该值为 0

    public MyQueue() {
        this.data = new Object[this.minsize];
        this.maxsize = this.minsize;
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        // TODO
        return (rear + 1) % maxsize == front;
    }

    public int size() {
        // TODO
        return (rear + 1) % maxsize == front;
    }

    public T add(T item) {
        if (this.rear == this.maxsize) {
            return null;
        }
        if (rear == maxsize - 1) {
            System.out.println();
        }
        data[rear] = item;
        rear++;
        return item;
    }

    public T poll() {
        if (front == rear) {
            return null;
        } else {
        }
    }

    public T peek() {
        if (front == rear) {
            return null;
        }
        return (T) data[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("kong");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + "\b");
            }
            System.out.println();
        }
    }
}
*/
