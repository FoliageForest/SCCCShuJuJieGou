package qimo.dormitory;

/**
 * 宿舍类
 */
public class Dormitory {

    private String dormitoryNumber;
    private String bedNumber;
    private Student[] students;

    public Dormitory(String dormitoryNumber, String bedNumber, Student[] students) {
        this.dormitoryNumber = dormitoryNumber;
        this.bedNumber = bedNumber;
        this.students = students;
    }

    public String getDormitoryNumber() {
        return dormitoryNumber;
    }

    public void setDormitoryNumber(String dormitoryNumber) {
        this.dormitoryNumber = dormitoryNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
