package hw20230327;

public class MyStack<T> {
    final int minsize = 10; // ջ�������С
    private Object[] data;
    private int maxsize; // ��ǰջ�Ĵ�С
    private int top; // ջ��ָ��

    public MyStack() {
        this.data = new Object[this.minsize];
        this.maxsize = this.minsize;
        this.top = -1;
    }

    // ��ջ(ѹջ)
    public T push(T item) {
        if (this.top == this.maxsize - 1) {
            this.addSize(this.maxsize * 2);
        }
        this.top++;
        this.data[top] = item;
        return item;
    }

    // ��ջ(��ջ)
    public T pop() {
        if (this.top == -1) {
            return null;
        }
        T t = (T) this.data[this.top];
        this.top--;
        return t;
    }

    public T peek() {
        if (this.top < 0) {
            return null;
        }
        return (T) this.data[this.top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    private void addSize(int size) {
        if (size <= this.maxsize) {
            return;
        }
        Object[] objects = new Object[size];
        System.arraycopy(this.data, 0, objects, 0, this.top + 1);
        this.data = objects;
        this.maxsize = size;
    }
}
