package hw20230224;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        int bjg = 0; // 不及格人数
        int temp;
        int sum = 0; // 全班成绩之和

        Scanner scanner = new Scanner(System.in);

        System.out.print("输入班级总人数: ");
        temp = scanner.nextInt();
        int[] scores = new int[temp]; // 保存每个人的成绩
        String[] IDs = new String[temp]; // 保存每个人的学号

        System.out.print("输入科目: ");
        String km = scanner.next(); // 科目

        // 输入每个人的科目和成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "============");
            System.out.print("成绩: ");
            temp = scanner.nextInt();
            sum += temp;
            if (temp < 60) {
                bjg++;
            }
            scores[i] = temp;
            System.out.print("学号: ");
            IDs[i] = scanner.next();
        }

        // 使用选择排序算法对成绩及其对应学号进行升序排序
        for (int i = 0; i < scores.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = scores[i];
                scores[i] = scores[min];
                scores[min] = tmp;
                // 相应的学号也要交换一下
                String tmpString = IDs[i];
                IDs[i] = IDs[min];
                IDs[min] = tmpString;
            }

        }

        // 输出
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print("学号" + (i + 1) + ": " + IDs[i] + ", ");
            System.out.println("成绩" + (i + 1) + ": " + scores[i]);
        }
        System.out.println("平均成绩: " + ((double) sum / scores.length));
        System.out.println("不及格人数: " + bjg);
    }
}
