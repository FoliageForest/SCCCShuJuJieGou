package qimo.student;

import qimo.student.list.Student;
import qimo.student.list.StudentSinglyLinkedList;

public class Test {
    public static void main(String[] args) {
        StudentSinglyLinkedList list = new StudentSinglyLinkedList();
        int stuIdInit = 123456000;
        list.addNodeAtFirst(new Student(++stuIdInit, "name001", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name002", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name003", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name004", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name005", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name006", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name007", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name008", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name009", 'W', "计应", "2132"));
        list.addNodeAtFirst(new Student(++stuIdInit, "name010", 'W', "计应", "2132"));

    }

}
