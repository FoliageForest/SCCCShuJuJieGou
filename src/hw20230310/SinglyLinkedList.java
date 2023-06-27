package hw20230310;

/*
单链表的插入、删除、查找操作
 */
public class SinglyLinkedList {
    /**
     * 头节点
     */
    private final Node listHead;

    /**
     * 单链表大小
     */
    private int listSize;

    /**
     * 初始化空白链表
     */
    public SinglyLinkedList() {
        this.listHead = new Node("Head", null);
        this.listSize = 0;
    }

    /**
     * 使用字符串数组初始化链表
     */
    public SinglyLinkedList(String[] data) {
        this();
        Node p = this.listHead;
        for (String s : data) {
            p.setNext(new Node(s, null));
            p = p.getNext();
            this.listSize++;
        }
    }

    public int getListSize() {
        return this.listSize;
    }

    /**
     * 查看链表的内容
     */
    public String list2String() {
        String returnString = "HEAD";
        Node p = this.listHead.getNext();
        while (p != null) {
            returnString = returnString + " -> " + p.getData();
            p = p.getNext();
        }
        return returnString;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   增   加   节   点   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 链表尾部插入
     */
    public void addNodeAtLast(String value) {
        Node p = this.listHead;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(new Node(value, null));
        this.listSize++;
    }

    /**
     * 链表头部插入
     */
    public void addNodeAtFirst(String value) {
        // 新插入节点的前驱节点为头节点
        this.listHead.setNext(new Node(value, this.listHead.getNext()));
        this.listSize++;
    }

    /**
     * 在指定索引之后插入节点. 如果传入索引值不合法, 则不插入节点
     */
    public void addNodeAfterIndex(String value, int frontNodeIndex) {
        Node p = this.findNodeByIndex(frontNodeIndex);
        if (p != null) {
            this.addNodeAfterNode(value, this.findNodeByIndex(frontNodeIndex));
        }
    }

/*    public void addNodeAfterIndex(String value, int frontIndex) {
        // 提供的索引值的合法性判断
        if (frontIndex < 0 || frontIndex > this.listSize) {
            return;
        }
        int count = 0; // 当前索引计数器
        Node p = listHead;
        while (p.getNext() != null) {
            if (count == frontIndex) {
                this.addNodeAfterNode(value, p);
                return;
            }
            count++;
            p = p.getNext();
        }
    }*/

    /**
     * 指定前驱节点, 向单链表中插入新的节点. 其中, 前驱节点可以是头节点
     */
    private void addNodeAfterNode(String value, Node frontNode) {
        frontNode.setNext(new Node(value, frontNode.getNext()));
        this.listSize++;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   删   除   节   点   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 删除指定索引的节点
     */
    public void deleteNodeAt(int NodeIndex) {
        if (NodeIndex < 1 || NodeIndex > this.listSize) {
            return;
        }
        Node p = this.listHead; // 待删除节点的前驱节点
        int count = 0;
        while (count != (NodeIndex - 1)) {
            p = p.getNext();
            count++;
        }
/*
        NodeIndex--;
        Node p = this.findNodeByIndex(NodeIndex);
        if (p == null || NodeIndex == this.listSize) {
            return;
        }
*/
        p.setNext(p.getNext().getNext());
        this.listSize--;
    }

    /**
     * 删除存储指定数据的所有节点
     */
    public void deleteNodeByNodeValue(String value) {
        Node p = this.listHead.getNext();
        Node pFront = this.listHead; // 暂存前驱节点
        while (p != null) {
            if (p.getData().equals(value)) {
                // 当前节点后移, 前驱节点不动
                p = p.getNext();
                pFront.setNext(p);
                this.listSize--;
            } else {
                // 当前节点后移, 前驱节点后移
                p = p.getNext();
                pFront = pFront.getNext();
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   查   找   节   点   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 通过索引值查找返回相应节点. 如果传入索引不合法, 则返回 null
     */
    private Node findNodeByIndex(int index) {
        if (index < 0 || index > listSize) {
            return null;
        }
        Node p = listHead;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p;
    }

    /**
     * 通过索引值查找返回相应节点的数据域内容. 如果传入索引不合法, 则返回 null
     */
    public String findNodeDataByIndex(int index) {
        Node p = this.findNodeByIndex(index);
        if (p == null) {
            return null;
        }
        return p.getData();
    }

    /**
     * 通过数据域查找最靠前的对应节点, 返回索引值. 如果传入索引不合法, 则返回 -1
     */
    public int findNodeIndexByData(String data) {
        Node p = this.listHead;
        int index = 0;
        while (p.getNext() != null) {
            p = p.getNext();
            index++;
            if (p.getData().equals(data)) {
                return index;
            }
        }
        /*do {
            if (p.getData().equals(data)) {
                return index;
            }
            index++;
        } while (p.getNext() != null);*/
        return -1;
    }

}
