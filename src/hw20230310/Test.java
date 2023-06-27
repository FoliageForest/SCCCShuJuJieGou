package hw20230310;

public class Test {
    public static void main(String[] args) {
        addNodeTest();
    }

    /**
     * 添加节点测试
     */
    private static void addNodeTest() {

        // 链表头部插入
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.addNodeAtFirst("CCC");
        sLL.addNodeAtFirst("BBB");
        sLL.addNodeAtFirst("AAA");
        System.out.println(sLL.list2String());

        sLL = new SinglyLinkedList();
        sLL.addNodeAfterIndex("CCC", 0);
        sLL.addNodeAfterIndex("BBB", 0);
        sLL.addNodeAfterIndex("AAA", 0);
        System.out.println(sLL.list2String());

        // 链表尾部插入
        sLL = new SinglyLinkedList();
        sLL.addNodeAtLast("AAA");
        sLL.addNodeAtLast("BBB");
        sLL.addNodeAtLast("CCC");
        System.out.println(sLL.list2String());

        sLL = new SinglyLinkedList();
        sLL.addNodeAfterIndex("AAA", 0);
        sLL.addNodeAfterIndex("BBB", 1);
        sLL.addNodeAfterIndex("CCC", 2);
        System.out.println(sLL.list2String());

        // 链表中部插入
        sLL = new SinglyLinkedList();
        sLL.addNodeAfterIndex("AAA", 0);
        sLL.addNodeAfterIndex("BBB", 0);
        sLL.addNodeAfterIndex("CCC", 1);
        sLL.addNodeAfterIndex("DDD", 2);
        sLL.addNodeAfterIndex("EEE", 1);
        sLL.addNodeAfterIndex("FFF", 4);
        System.out.println(sLL.list2String());
    }

    /**
     * 删除节点测试
     */
    private static void deleteNodeTest() {
        // 删除指定索引的节点
        // 删头
        SinglyLinkedList sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC"});
        sLL.deleteNodeAt(1);
        sLL.deleteNodeAt(1);
        sLL.deleteNodeAt(1);
        System.out.println(sLL.list2String());
        // 删尾
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC"});
        for (int i = 3; i > 0; i--) {
            sLL.deleteNodeAt(i);
        }
        System.out.println(sLL.list2String());
        // 删中部
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});
        sLL.deleteNodeAt(4);
        sLL.deleteNodeAt(2);
        System.out.println(sLL.list2String());

        // 删除存储指定数据的所有节点
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "DDD", "EEE", "AAA", "FFF"});
        sLL.deleteNodeByNodeValue("AAA");
        System.out.println(sLL.list2String());
    }

    /**
     * 查找节点测试
     */
    private static void findNodeTest() {
        // 通过索引值查找返回相应节点的数据域内容
        SinglyLinkedList sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "AAA", "DDD", "EEE", "FFF", "GGG", "DDD"});
        for (int i = 1; i < 9; i++) {
            System.out.print(sLL.findNodeDataByIndex(i) + ", ");
        }
        System.out.println(sLL.findNodeDataByIndex(9));

        // 通过数据域查找最靠前的对应节点
        System.out.print(sLL.findNodeIndexByData("AAA") + ", ");
        System.out.print(sLL.findNodeIndexByData("BBB") + ", ");
        System.out.print(sLL.findNodeIndexByData("CCC") + ", ");
        System.out.print(sLL.findNodeIndexByData("DDD") + ", ");
        System.out.print(sLL.findNodeIndexByData("EEE") + ", ");
        System.out.print(sLL.findNodeIndexByData("FFF") + ", ");
        System.out.println(sLL.findNodeIndexByData("GGG"));
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   单 一 方 法 测 试   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    private static void findNodeByIndexTest() {
/*        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new String[]{"AAA"});
        for (int i = -1; i < 3; i++) {
            Node p = singlyLinkedList.findNodeByIndex(i);
            System.out.print(i + ": ");
            if (p == null) {
                System.out.println("null");
            } else {
                System.out.println(p.getData());
            }
        }*/
    }
}
