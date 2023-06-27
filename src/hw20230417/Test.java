package hw20230417;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("初始化");
        System.out.println(tree.find(500));

        System.out.println("===============================");
        System.out.println("插入: 500, " + tree.insert(500));
        // 500
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(600));

        System.out.println("===============================");
        System.out.println("插入: 250, " + tree.insert(250));
        // 500(250, )
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(100));
        System.out.println(tree.find(300));
        System.out.println(tree.find(700));

        System.out.println("===============================");
        System.out.println("插入: 1000, " + tree.insert(1000));
        // 500(250, 1000)
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(1000));
        System.out.println(tree.find(110));
        System.out.println(tree.find(300));
        System.out.println(tree.find(700));
        System.out.println(tree.find(1200));

        System.out.println("===============================");
        System.out.println("插入: 100, " + tree.insert(100));
        // 500 (250 (100, ), 1000)
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(100));
        System.out.println(tree.find(1000));
        System.out.println(tree.find(200));

        System.out.println("===============================");
        System.out.println("插入: 330, " + tree.insert(330));
        // 500 (250 (100, 330), 1000)
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(100));
        System.out.println(tree.find(330));
        System.out.println(tree.find(1000));
        System.out.println(tree.find(340));

        System.out.println("===============================");
        System.out.println("插入: 300, " + tree.insert(300));
        // 500 (250 (100, 330(300, )), 1000)
        System.out.println(tree.find(500));
        System.out.println(tree.find(250));
        System.out.println(tree.find(100));
        System.out.println(tree.find(330));
        System.out.println(tree.find(300));
        System.out.println(tree.find(1000));
        System.out.println(tree.find(340));

        System.out.println("===============================");
        System.out.println("插入: 250, " + tree.insert(250));
    }
}
