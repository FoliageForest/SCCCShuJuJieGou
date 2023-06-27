package hw20230327;

public class MyStackTest {
    public static void main(String[] args) {
        // ��ʼ�� -> ��ջ a -> ��ջ b -> ��һ�ε�ջ -> ��ջ c -> �ڶ��ε�ջ -> �����ε�ջ
        // ��ʼ��
        MyStack<String> stringMyStack = new MyStack<>();
        System.out.println("��ʼ����ɺ�, ջ�Ƿ�Ϊ��: " + stringMyStack.isEmpty());
        System.out.println("��ʼ����ɺ�, δ��ջ, �鿴ջ��Ԫ��: " + stringMyStack.peek());

        // ��ջ a
        stringMyStack.push("a");
        System.out.println("��һ����ջ֮��, ջ�Ƿ�Ϊ��: " + stringMyStack.isEmpty());

        // ��ջ b
        System.out.println("�ڶ�����ջ, ��ջԪ��: " + stringMyStack.push("b"));
        System.out.println("�ڶ�����ջ֮��, �鿴ջ��Ԫ��: " + stringMyStack.peek());

        // ��һ�ε�ջ
        System.out.println("��һ�ε�ջ, ��ǰ������Ԫ��: " + stringMyStack.pop());
        System.out.println("��һ�ε�ջ��, �鿴ջ��Ԫ��: " + stringMyStack.peek());
        System.out.println("��һ�ε�ջ��, ջ�Ƿ�Ϊ��: " + stringMyStack.isEmpty());

        // ��ջ c
        System.out.println("��������ջ, ��ǰ����ջԪ��: " + stringMyStack.push("c"));

        // �ڶ��ε�ջ
        System.out.println("�ڶ��ε�ջ, ��ǰ������Ԫ��: " + stringMyStack.pop());
        System.out.println("�ڶ��ε�ջ��, ջ�Ƿ�Ϊ��: " + stringMyStack.isEmpty());
        System.out.println("�ڶ��ε�ջ��, �鿴ջ��Ԫ��: " + stringMyStack.peek());

        // �����ε�ջ
        System.out.println("�����ε�ջ, ��ǰ������Ԫ��: " + stringMyStack.pop());
        System.out.println("�����ε�ջ, ջ�Ƿ�Ϊ��: " + stringMyStack.isEmpty());
        System.out.println("�����ε�ջ, �鿴ջ��Ԫ��: " + stringMyStack.peek());
    }
}
