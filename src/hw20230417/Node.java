package hw20230417;

public class Node {
    public int data;
    public Node leftNode;
    public Node rightNode;

    public Node(int key) {
        this.data = key;
    }

    @Override
    public String toString() {
        return "当前 Node 对象的值为: " + String.valueOf(this.data);
    }
}
