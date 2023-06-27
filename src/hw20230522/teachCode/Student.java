package hw20230522.teachCode;

// !!! 不要用 IDEA 格式化
// !!! 不要用 IDEA 格式化
// !!! 不要用 IDEA 格式化
public class Student {
    private final String id;
    private final String name;
    private final char sex;
    private final int age;

    public Student(String id, String name, char sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (id != other.id) return false;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", sex=" + sex + ", age=" + age + '}';
    }
}
