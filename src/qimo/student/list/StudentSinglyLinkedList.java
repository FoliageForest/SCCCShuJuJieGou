package qimo.student.list;

public class StudentSinglyLinkedList {
    /**
     * 头节点
     */
    private final Node listHead = new Node(null, null);

    /**
     * 单链表大小
     */
    private int listSize = 0;

    //////////////////////////////////////////////////////////////////////////
    /////////////////   增   加   节   点   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 链表尾部插入
     */
    public void addNodeAtLast(Student student) {
        Node p = this.listHead;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(new Node(student, null));
        this.listSize++;
    }

    /**
     * 链表头部插入
     */
    public void addNodeAtFirst(Student value) {
        // 新插入节点的前驱节点为头节点
        this.listHead.setNext(new Node(value, this.listHead.getNext()));
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

    //////////////////////////////////////////////////////////////////////////
    /////////////////   计   算   总   分   和   平   均   分   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 根据学号计算该生平均成绩
     *
     * @param stuId 学号
     * @return 该生平均成绩. 无该学生则返回 0.0
     */
    public double computeGradesAvg(int stuId) {
        return this.computeGradesSum(stuId) / 3.0;
    }

    /**
     * 根据学号计算该生总成绩
     *
     * @param stuId 学号
     * @return 该生总成绩. 无该学生则返回 0.0
     */
    public double computeGradesSum(int stuId) {
        // TODO
        Node p = this.listHead;
        double sum = 0.0;
        while (p.getNext() != null) {
            p = p.getNext();
            if (p.getData().getStuId() == stuId) {
                for (double grade : p.getData().getGrades()) {
                    sum += grade;
                }
                break;
            }
        }
        return sum;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   查   找   节   点   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 通过学生名字查找学生, 返回对应学生类的单链表
     */
    public StudentSinglyLinkedList findStudentByName(String studentName) {
        StudentSinglyLinkedList list = new StudentSinglyLinkedList();
        Node p = this.listHead;
        while (p.getNext() != null) {
            p = p.getNext();
            Student student = p.getData();
            if (student.getName().equals(studentName)) {
                list.addNodeAtFirst(student);
            }
        }
        return list;
    }

}
