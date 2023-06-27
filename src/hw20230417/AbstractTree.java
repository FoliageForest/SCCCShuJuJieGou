package hw20230417;

public abstract class AbstractTree {
    public int count = 0;
    public abstract Node find(int key);
    public abstract boolean insert(int newData);
}
