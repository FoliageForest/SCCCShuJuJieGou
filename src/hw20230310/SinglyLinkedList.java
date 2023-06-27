package hw20230310;

/*
������Ĳ��롢ɾ�������Ҳ���
 */
public class SinglyLinkedList {
    /**
     * ͷ�ڵ�
     */
    private final Node listHead;

    /**
     * �������С
     */
    private int listSize;

    /**
     * ��ʼ���հ�����
     */
    public SinglyLinkedList() {
        this.listHead = new Node("Head", null);
        this.listSize = 0;
    }

    /**
     * ʹ���ַ��������ʼ������
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
     * �鿴���������
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
    /////////////////   ��   ��   ��   ��   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * ����β������
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
     * ����ͷ������
     */
    public void addNodeAtFirst(String value) {
        // �²���ڵ��ǰ���ڵ�Ϊͷ�ڵ�
        this.listHead.setNext(new Node(value, this.listHead.getNext()));
        this.listSize++;
    }

    /**
     * ��ָ������֮�����ڵ�. �����������ֵ���Ϸ�, �򲻲���ڵ�
     */
    public void addNodeAfterIndex(String value, int frontNodeIndex) {
        Node p = this.findNodeByIndex(frontNodeIndex);
        if (p != null) {
            this.addNodeAfterNode(value, this.findNodeByIndex(frontNodeIndex));
        }
    }

/*    public void addNodeAfterIndex(String value, int frontIndex) {
        // �ṩ������ֵ�ĺϷ����ж�
        if (frontIndex < 0 || frontIndex > this.listSize) {
            return;
        }
        int count = 0; // ��ǰ����������
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
     * ָ��ǰ���ڵ�, �������в����µĽڵ�. ����, ǰ���ڵ������ͷ�ڵ�
     */
    private void addNodeAfterNode(String value, Node frontNode) {
        frontNode.setNext(new Node(value, frontNode.getNext()));
        this.listSize++;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   ɾ   ��   ��   ��   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * ɾ��ָ�������Ľڵ�
     */
    public void deleteNodeAt(int NodeIndex) {
        if (NodeIndex < 1 || NodeIndex > this.listSize) {
            return;
        }
        Node p = this.listHead; // ��ɾ���ڵ��ǰ���ڵ�
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
     * ɾ���洢ָ�����ݵ����нڵ�
     */
    public void deleteNodeByNodeValue(String value) {
        Node p = this.listHead.getNext();
        Node pFront = this.listHead; // �ݴ�ǰ���ڵ�
        while (p != null) {
            if (p.getData().equals(value)) {
                // ��ǰ�ڵ����, ǰ���ڵ㲻��
                p = p.getNext();
                pFront.setNext(p);
                this.listSize--;
            } else {
                // ��ǰ�ڵ����, ǰ���ڵ����
                p = p.getNext();
                pFront = pFront.getNext();
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   ��   ��   ��   ��   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * ͨ������ֵ���ҷ�����Ӧ�ڵ�. ��������������Ϸ�, �򷵻� null
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
     * ͨ������ֵ���ҷ�����Ӧ�ڵ������������. ��������������Ϸ�, �򷵻� null
     */
    public String findNodeDataByIndex(int index) {
        Node p = this.findNodeByIndex(index);
        if (p == null) {
            return null;
        }
        return p.getData();
    }

    /**
     * ͨ������������ǰ�Ķ�Ӧ�ڵ�, ��������ֵ. ��������������Ϸ�, �򷵻� -1
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
