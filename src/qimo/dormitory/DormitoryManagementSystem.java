package qimo.dormitory;

import java.util.Scanner;

public class DormitoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dormitory[] dormitories = new Dormitory[10];
        int dormitoryCount = 0;

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 添加宿舍信息");
            System.out.println("2. 查询宿舍信息");
            System.out.println("3. 查询学生所住宿舍");
            System.out.println("4. 修改宿舍信息");
            System.out.println("5. 删除宿舍信息");
            System.out.println("6. 退出");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // 添加宿舍信息
                    break;
                case 2:
                    // 查询宿舍信息
                    break;
                case 3:
                    // 查询学生所住宿舍
                    break;
                case 4:
                    // 修改宿舍信息
                    break;
                case 5:
                    // 删除宿舍信息
                    break;
                case 6:
                    // 退出程序
                    return;
                default:
                    System.out.println("无效的选择，请重新输入。");
                    break;
            }
        }
    }
}
