package hw20230417;

public class Tree extends AbstractTree {
    private Node root;

    public Node find(int key) {
        if (this.root == null) {
            return null;
        }
        return this.find(key, this.root);
    }

    private Node find(int key, Node currentNode) {
        if (key < currentNode.data) {
            if (currentNode.leftNode == null) {
                return null;
            }
            return this.find(key, currentNode.leftNode);
        } else if (key > currentNode.data) {
            if (currentNode.rightNode == null) {
                return null;
            }
            return this.find(key, currentNode.rightNode);
        }
        return currentNode;
    }

    public boolean insert(int newData) {
        if (this.root == null) {
            this.root = new Node(newData);
            return true;
        }
        return insert(newData, root);
    }

    private boolean insert(int newData, Node currentNode) {
        if (newData < currentNode.data) {
            if (currentNode.leftNode == null) {
                currentNode.leftNode = new Node(newData);
                this.count++;
                return true;
            }
            return insert(newData, currentNode.leftNode);
        } else if (newData > currentNode.data) {
            if (currentNode.rightNode == null) {
                currentNode.rightNode = new Node(newData);
                this.count++;
                return true;
            }
            return insert(newData, currentNode.rightNode);
        }
        return false;
    }
}
