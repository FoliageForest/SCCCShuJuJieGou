package hw20230403.b2;

public class MyQueue<T> {
    private Object[] data;
    private int front; // �߼���ʼ��ָ���ͷԪ��. ��ʼֵΪ 0
    private int rear; // �߼���ʼ��ָ���βԪ�ص���һ��λ��

    public MyQueue() {
        this.data = new Object[10];
        this.front = 0;
        this.rear = 0;
    }

    /**
     * ���
     *
     * @param item ���Ԫ��
     * @return ���Ԫ��
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
     * ����
     *
     * @return ����Ԫ��. �ն��еĳ���Ԫ��Ϊ null
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
        StringBuffer stringBuffer = new StringBuffer("��ͷ - ");
        for (int i = 0; i < this.rear - this.front; i++) {
            stringBuffer.append(this.data[(this.front + i) % this.data.length].toString());
            stringBuffer.append(" - ");
        }
        stringBuffer.append("��β");
        return stringBuffer.toString();
    }
}
