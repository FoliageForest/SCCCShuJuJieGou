package qimo.student.list;

/*
参考千锋的教学
 */

import java.util.Arrays;

public class Student {
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
    private double[] grades = {0.0, 0.0, 0.0};

    public Student(int stuId, String name, char sex, String major, String stuClass, double[] grades) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.major = major;
        this.stuClass = stuClass;
        this.grades = grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    /**
     * 修改某个学生的成绩
     *
     * @param index 所修改成绩在 grades 数组中的索引
     * @param data  成绩值
     */
    public void setGrades(int index, double data) {
        this.grades[index] = data;
    }

    //////////////////////////////////////////////////////////////////////////
    /////////////////   计   算   总   分   和   平   均   分   ///////////////////////////////////
    //////////////////////////////////////////////////////////////////////////

    /**
     * 计算当前学生的平均成绩
     *
     * @return 当前学生的平均成绩
     */
    public double computeGradesAvg() {
        return this.computeGradesSum() / 3.0;
    }

    /**
     * 计算当前学生的总成绩
     *
     * @return 当前学生的总成绩
     */
    public double computeGradesSum() {
        double sum = 0.0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum;
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

    @Override
    public String toString() {
        return "Student{" + "stuId=" + stuId + ", name='" + name + '\'' + ", sex=" + sex + ", major='" + major + '\'' + ", stuClass='" + stuClass + '\'' + ", grades=" + Arrays.toString(grades) + '}';
    }
}
