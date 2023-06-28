package qimo.student.list;

class Node {
    private final Student data;
    private Node next;

    Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
