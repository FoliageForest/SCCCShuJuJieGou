package hw20230403.b1;

public class MyQueue<T> {
    private Object[] data;
    private int rear; // 指向队尾的下一个位置

    public MyQueue() {
        this.data = new Object[10];
        this.rear = 0;
    }

    /**
     * 入队
     *
     * @param item 入队元素
     * @return 入队元素
     */
    public T add(T item) {
        if (this.isFull()) {
            Object[] objects = new Object[this.data.length * 2];
            System.arraycopy(this.data, 0, objects, 0, this.data.length);
            this.data = objects;
        }
        this.data[this.rear] = item;
        this.rear++;
        return item;
    }

    /**
     * 出队
     *
     * @return 出队元素. 空队列的出队元素为 null
     */
    public T poll() {
        if (this.rear == 0) {
            return null;
        }
        T returnItem = (T) this.data[0];
        System.arraycopy(this.data, 1, this.data, 0, this.rear);
        this.rear--;
        return returnItem;
    }

    public boolean isFull() {
        return this.rear == this.data.length;
    }

    public boolean isEmpty() {
        return this.rear == 0;
    }

    public String showQueue() {
        StringBuffer stringBuffer = new StringBuffer("队头 - ");
        for (int i = 0; i < this.rear; i++) {
            stringBuffer.append(this.data[i].toString());
            stringBuffer.append(" - ");
        }
        stringBuffer.append("队尾");
        return stringBuffer.toString();
    }
}
