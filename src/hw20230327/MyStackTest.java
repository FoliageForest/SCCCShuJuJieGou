package hw20230327;

public class MyStackTest {
    public static void main(String[] args) {
        // 初始化 -> 入栈 a -> 入栈 b -> 第一次弹栈 -> 入栈 c -> 第二次弹栈 -> 第三次弹栈
        // 初始化
        MyStack<String> stringMyStack = new MyStack<>();
        System.out.println("初始化完成后, 栈是否为空: " + stringMyStack.isEmpty());
        System.out.println("初始化完成后, 未入栈, 查看栈顶元素: " + stringMyStack.peek());

        // 入栈 a
        stringMyStack.push("a");
        System.out.println("第一次入栈之后, 栈是否为空: " + stringMyStack.isEmpty());

        // 入栈 b
        System.out.println("第二次入栈, 入栈元素: " + stringMyStack.push("b"));
        System.out.println("第二次入栈之后, 查看栈顶元素: " + stringMyStack.peek());

        // 第一次弹栈
        System.out.println("第一次弹栈, 当前弹出的元素: " + stringMyStack.pop());
        System.out.println("第一次弹栈后, 查看栈顶元素: " + stringMyStack.peek());
        System.out.println("第一次弹栈后, 栈是否为空: " + stringMyStack.isEmpty());

        // 入栈 c
        System.out.println("第三次入栈, 当前的入栈元素: " + stringMyStack.push("c"));

        // 第二次弹栈
        System.out.println("第二次弹栈, 当前弹出的元素: " + stringMyStack.pop());
        System.out.println("第二次弹栈后, 栈是否为空: " + stringMyStack.isEmpty());
        System.out.println("第二次弹栈后, 查看栈顶元素: " + stringMyStack.peek());

        // 第三次弹栈
        System.out.println("第三次弹栈, 当前弹出的元素: " + stringMyStack.pop());
        System.out.println("第三次弹栈, 栈是否为空: " + stringMyStack.isEmpty());
        System.out.println("第三次弹栈, 查看栈顶元素: " + stringMyStack.peek());
    }
}
