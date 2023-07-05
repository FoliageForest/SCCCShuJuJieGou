package qimo.student.list;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementSystem {
    public static StudentSinglyLinkedList studentsSinglyLinkedList = new StudentSinglyLinkedList();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 添加学生信息");
            System.out.println("2. 查询学生信息和学生成绩");
            System.out.println("3. 查询学生所住宿舍（废弃）");
            System.out.println("4. 修改学生信息");
            System.out.println("5. 删除学生信息");
            System.out.println("6. 退出");
            System.out.println("7. 初始化学生信息（仅用于测试模式）");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // 添加学生信息
                    addStudent();
                    break;
                case 2:
                    // 查询学生信息和学生成绩
                    searchStudent();
                    break;
                case 3:
                    break;
                case 4:
                    // 修改学生信息
                    updateStudent();
                    break;
                case 5:
                    // 删除学生信息
                    deleteStudent();
                    break;
                case 6:
                    // 退出程序
                    System.exit(0);
                case 7:
                    // 初始化学生信息（仅用于测试模式）
                    initializeTestData();
                    break;
                default:
                    System.out.println("无效的选择，请重新输入。");
                    break;
            }
        }
    }

    /**
     * 初始化学生信息（仅用于测试模式）
     */
    private static void initializeTestData() {
        for (int i = 0; i < 9; i++) {
            double[] grades = {Math.random() * 100, Math.random() * 100, Math.random() * 100};
            Student s = new Student(123456001 + i, "name00" + (i + 1), 'M', "计应", "2132", grades);
            studentsSinglyLinkedList.addNodeAtFirst(s);
        }
    }

    /**
     * 修改学生信息
     */
    private static void updateStudent() {
        System.out.println("当前只支持修改学生成绩，当前只支持通过学生姓名定位学生。是否继续？(Y/N)");
        if (!scanner.nextLine().equals("Y")) {
            return;
        }
        System.out.print("请输出学生姓名：");
        String stuName = scanner.nextLine();
        Student student = studentsSinglyLinkedList.findStudentByName(stuName);
        System.out.println("当前的学生成绩为：" + Arrays.toString(student.getGrades()) + "，请输入新的成绩：");
        for (int i = 0; i < student.getGrades().length; i++) {
            student.getGrades()[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    }

    /**
     * 删除学生信息
     */
    private static void deleteStudent() {
        System.out.println("目前支持通过学号和通过姓名删除学生信息。");
        System.out.println("请输入 id 以通过学号删除学生的信息，请输入 name 以通过姓名删除学生的信息。输入 Q 返回上一界面");
        if ("id".equals(scanner.nextLine())) {
            System.out.print("请输入 int stuId:");
            int stuId = scanner.nextInt();
            studentsSinglyLinkedList.deleteStuByStuId(stuId);
        } else if ("name".equals(scanner.nextLine())) {
            System.out.print("请输入 String name:");
            String name = scanner.nextLine();
            studentsSinglyLinkedList.deleteStuByName(name);
        }
    }

    /**
     * 添加学生信息
     */
    public static void addStudent() {
        System.out.println("int stuId:");
        int stuId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("String name:");
        String name = scanner.nextLine();

        System.out.println("char sex:");
        char sex = scanner.nextLine().charAt(0);

        System.out.println("String major:");
        String major = scanner.nextLine();

        System.out.println("String stuClass:");
        String stuClass = scanner.nextLine();

        System.out.println("double[] grades:");
        double[] grades = new double[3];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        Student student = new Student(stuId, name, sex, major, stuClass, grades);
        System.out.println("您添加的信息: " + student);
        studentsSinglyLinkedList.addNodeAtFirst(student);
    }

    /**
     * 查询学生信息和学生成绩
     */
    public static void searchStudent() {
        System.out.print("请输出学生姓名：");
        String stuName = scanner.nextLine();
        Student student = studentsSinglyLinkedList.findStudentByName(stuName);
        if (student == null) {
            System.out.println("不存在此学生");
            return;
        }
        System.out.println("当前学生的信息：" + student);
    }

}
