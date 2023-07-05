package hw20230403.b2;

public class MyQueue<T> {
    private Object[] data;
    private int front; // 逻辑上始终指向队头元素. 初始值为 0
    private int rear; // 逻辑上始终指向队尾元素的下一个位置

    public MyQueue() {
        this.data = new Object[10];
        this.front = 0;
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
            for (int i = 0; i < this.rear - this.front; i++) {
                objects[i] = this.data[(this.front + i) % this.data.length];
            }
            this.front = 0;
            this.rear = this.data.length;
            this.data = objects;
        }
        this.data[this.rear % data.length] = item;
        this.rear++;
        return item;
    }

    /**
     * 出队
     *
     * @return 出队元素. 空队列的出队元素为 null
     */
    public T poll() {
        if (this.isEmpty()) {
            return null;
        }
        T returnItem = (T) this.data[this.front % this.data.length];
        this.front++;
        return returnItem;
    }

    public boolean isFull() {
        return this.rear - this.front == this.data.length;
    }

    public boolean isEmpty() {
        return this.rear - this.front == 0;
    }

    public String showQueue() {
        StringBuffer stringBuffer = new StringBuffer("队头 - ");
        for (int i = 0; i < this.rear - this.front; i++) {
            stringBuffer.append(this.data[(this.front + i) % this.data.length].toString());
            stringBuffer.append(" - ");
        }
        stringBuffer.append("队尾");
        return stringBuffer.toString();
    }
}
