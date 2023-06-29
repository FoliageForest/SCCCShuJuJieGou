package qimo.student;

import qimo.student.list.Student;
import qimo.student.list.StudentSinglyLinkedList;

public class Test {
    public static void main(String[] args) {
        StudentSinglyLinkedList list = new StudentSinglyLinkedList();
        int stuIdInit = 123456000;
        Student[] students = new Student[9];
        for (int i = 0; i < students.length; i++) {
            Student s = new Student(++stuIdInit, "name00" + (i + 1), 'M', "计应", "2132");
            s.setGrades(new double[]{Math.random() * 100, Math.random() * 100, Math.random() * 100});
            list.addNodeAtFirst(s);
        }

    }

}
