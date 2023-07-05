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

    /**
     * 通过学生的学号删除符合条件的学生信息. 会遍历整个单链表
     *
     * @param stuId 传入的学号
     */
    public void deleteStuByStuId(int stuId) {
        Node p = this.listHead.getNext();
        Node pFront = this.listHead; // 暂存前驱节点
        while (p != null) {
            if (p.getData().getStuId() == stuId) {
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

    /**
     * 通过学生的姓名删除符合条件的学生信息. 会遍历整个单链表
     *
     * @param stuName 传入的学生姓名
     */
    public void deleteStuByName(String stuName) {
        Node p = this.listHead.getNext();
        Node pFront = this.listHead; // 暂存前驱节点
        while (p != null) {
            if (p.getData().getName().equals(stuName)) {
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
     * 通过学生名字查找学生
     *
     * @param studentName 学生姓名
     * @return 查找到的学生对象. 未找到则返回 null
     */
    public Student findStudentByName(String studentName) {
        Node p = this.listHead;
        while (p.getNext() != null) {
            p = p.getNext();
            Student student = p.getData();
            if (student.getName().equals(studentName)) {
                return student;
            }
        }
        return null;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   工   具   方   法   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 把单链表转为数组
     *
     * @return 学生类数组
     */
    public Student[] list2Array() {
        Student[] students = new Student[this.listSize];
        Node p = this.listHead;
        for (int i = 0; i < students.length; i++) {
            p = p.getNext();
            students[i] = p.getData();
        }
        return students;
    }

}
