package qimo.student.list;

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
        int stuIdInit = 123456000;
        for (int i = 0; i < 9; i++) {
            double[] grades = {Math.random() * 100, Math.random() * 100, Math.random() * 100};
            Student s = new Student(++stuIdInit, "name00" + (i + 1), 'M', "计应", "2132", grades);
            studentsSinglyLinkedList.addNodeAtFirst(s);
        }
    }

    /**
     * TODO 修改学生信息
     */
    private static void updateStudent() {
        System.out.println("当前只支持修改学生成绩，当前只支持通过学生姓名定位学生。是否继续？(Y/N)");
    }

    /**
     * TODO 删除学生信息
     */
    private static void deleteStudent() {
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
     * TODO 查询学生信息和学生成绩
     */
    public static void searchStudent() {
    }

}
