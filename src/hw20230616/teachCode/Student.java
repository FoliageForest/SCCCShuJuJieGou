package hw20230616.teachCode;

public class Student {
    private final String name;
    private final char sex;

    public Student(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", sex=" + sex + '}';
    }
}
