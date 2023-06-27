package hw20230522.teachCode;

import java.util.HashSet;

public class StudentHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student per1 = new Student("id-01", "name-01", 'M', 11);
        Student per2 = new Student("id-02", "name-02", 'W', 12);
        Student per3 = new Student("id-03", "name-03", 'M', 13);
        Student per4 = new Student("id-02", "name-02", 'M', 14);
        Student per5 = new Student("id-02", "name-02", 'M', 15);
        hs.add(per1);
        hs.add(per2);
        hs.add(per3);
        hs.add(per4);
        hs.add(per5);
        System.out.println(hs);
    }
}
