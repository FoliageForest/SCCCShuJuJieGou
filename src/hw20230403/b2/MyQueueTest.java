package hw20230403.b2;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();

        System.out.println("====== 初始化");
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 入队 A");
        System.out.println(stringMyQueue.add("A"));
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 出队 A");
        System.out.println(stringMyQueue.poll());
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 入队 8 个元素, 分别为 A, B, C, D, E, F, G, H, 当前队列共 8 个元素");
        for (int i = 0; i < 8; i++) {
            stringMyQueue.add(String.valueOf((char) (65 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 入队 2 个元素, 分别为 a, b, 当前队列共 10 个元素");
        for (int i = 0; i < 2; i++) {
            stringMyQueue.add(String.valueOf((char) (97 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 入队 2 个元素, 分别为 c, d, 当前队列共 12 个元素");
        for (int i = 2; i < 4; i++) {
            stringMyQueue.add(String.valueOf((char) (97 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 全部出队");
        while (true) {
            if (stringMyQueue.poll() == null) {
                break;
            }
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());

        System.out.println("====== 入队 10 个元素, 分别为 A, B, C, D, E, F, G, H, I, J, 当前队列共 10 个元素");
        for (int i = 0; i < 10; i++) {
            stringMyQueue.add(String.valueOf((char) (65 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("是否为空: " + stringMyQueue.isEmpty());
        System.out.println("是否为满: " + stringMyQueue.isFull());
    }
}
