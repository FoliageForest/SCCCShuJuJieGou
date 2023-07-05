package hw20230403.b2;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> stringMyQueue = new MyQueue<>();

        System.out.println("====== ��ʼ��");
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ��� A");
        System.out.println(stringMyQueue.add("A"));
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ���� A");
        System.out.println(stringMyQueue.poll());
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ��� 8 ��Ԫ��, �ֱ�Ϊ A, B, C, D, E, F, G, H, ��ǰ���й� 8 ��Ԫ��");
        for (int i = 0; i < 8; i++) {
            stringMyQueue.add(String.valueOf((char) (65 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ��� 2 ��Ԫ��, �ֱ�Ϊ a, b, ��ǰ���й� 10 ��Ԫ��");
        for (int i = 0; i < 2; i++) {
            stringMyQueue.add(String.valueOf((char) (97 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ��� 2 ��Ԫ��, �ֱ�Ϊ c, d, ��ǰ���й� 12 ��Ԫ��");
        for (int i = 2; i < 4; i++) {
            stringMyQueue.add(String.valueOf((char) (97 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ȫ������");
        while (true) {
            if (stringMyQueue.poll() == null) {
                break;
            }
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());

        System.out.println("====== ��� 10 ��Ԫ��, �ֱ�Ϊ A, B, C, D, E, F, G, H, I, J, ��ǰ���й� 10 ��Ԫ��");
        for (int i = 0; i < 10; i++) {
            stringMyQueue.add(String.valueOf((char) (65 + i)));
        }
        System.out.println(stringMyQueue.showQueue());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isEmpty());
        System.out.println("�Ƿ�Ϊ��: " + stringMyQueue.isFull());
    }
}
