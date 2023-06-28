package qimo.student.list;

/*
参考千锋的教学
 */

class Student {
    /**
     * 学号
     */
    private final int stuId;
    private final String name;
    private final char sex;

    /**
     * 专业
     */
    private final String major;

    /**
     * 班级
     */
    private final String stuClass;

    /**
     * 三个科目的成绩
     */
    private double[] grades = new double[3];

    public Student(int stuId, String name, char sex, String major, String stuClass) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.stuClass = stuClass;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    /**
     * 修改某个学生的成绩
     *
     * @param index 索引
     * @param data  数据值
     */
    public void setGrades(int index, double data) {
        this.grades[index] = data;
    }

    /////////  Getter  /////////

    public int getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public String getMajor() {
        return major;
    }

    public String getStuClass() {
        return stuClass;
    }

    public double[] getGrades() {
        return grades;
    }
}
