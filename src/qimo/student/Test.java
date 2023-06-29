package qimo.student;

import qimo.student.list.Student;
import qimo.student.list.StudentSinglyLinkedList;

public class Test {
    public static void main(String[] args) {
        StudentSinglyLinkedList list = new StudentSinglyLinkedList();
        int stuIdInit = 123456000;
        for (int i = 0; i < 3; i++) {
            double[] grades = {Math.random() * 100, Math.random() * 100, Math.random() * 100};
            Student s = new Student(++stuIdInit, "name00" + (i + 1), 'M', "计应", "2132", grades);
            list.addNodeAtFirst(s);
        }

    }

}
