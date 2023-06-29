package qimo.dormitory;

public class Student {
    private String name;

    /**
     * 性别
     */
    private String gender;
    private int age;
    private String studentId;

    public Student(String name, String gender, int age, String studentId) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
    }

}
