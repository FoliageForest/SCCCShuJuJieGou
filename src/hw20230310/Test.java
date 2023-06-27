package hw20230310;

public class Test {
    public static void main(String[] args) {
        addNodeTest();
    }

    /**
     * ��ӽڵ����
     */
    private static void addNodeTest() {

        // ����ͷ������
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

        // ����β������
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

        // �����в�����
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
     * ɾ���ڵ����
     */
    private static void deleteNodeTest() {
        // ɾ��ָ�������Ľڵ�
        // ɾͷ
        SinglyLinkedList sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC"});
        sLL.deleteNodeAt(1);
        sLL.deleteNodeAt(1);
        sLL.deleteNodeAt(1);
        System.out.println(sLL.list2String());
        // ɾβ
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC"});
        for (int i = 3; i > 0; i--) {
            sLL.deleteNodeAt(i);
        }
        System.out.println(sLL.list2String());
        // ɾ�в�
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"});
        sLL.deleteNodeAt(4);
        sLL.deleteNodeAt(2);
        System.out.println(sLL.list2String());

        // ɾ���洢ָ�����ݵ����нڵ�
        sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "DDD", "EEE", "AAA", "FFF"});
        sLL.deleteNodeByNodeValue("AAA");
        System.out.println(sLL.list2String());
    }

    /**
     * ���ҽڵ����
     */
    private static void findNodeTest() {
        // ͨ������ֵ���ҷ�����Ӧ�ڵ������������
        SinglyLinkedList sLL = new SinglyLinkedList(new String[]{"AAA", "BBB", "CCC", "AAA", "DDD", "EEE", "FFF", "GGG", "DDD"});
        for (int i = 1; i < 9; i++) {
            System.out.print(sLL.findNodeDataByIndex(i) + ", ");
        }
        System.out.println(sLL.findNodeDataByIndex(9));

        // ͨ������������ǰ�Ķ�Ӧ�ڵ�
        System.out.print(sLL.findNodeIndexByData("AAA") + ", ");
        System.out.print(sLL.findNodeIndexByData("BBB") + ", ");
        System.out.print(sLL.findNodeIndexByData("CCC") + ", ");
        System.out.print(sLL.findNodeIndexByData("DDD") + ", ");
        System.out.print(sLL.findNodeIndexByData("EEE") + ", ");
        System.out.print(sLL.findNodeIndexByData("FFF") + ", ");
        System.out.println(sLL.findNodeIndexByData("GGG"));
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   �� һ �� �� �� ��   ///////////////////////////////////
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
