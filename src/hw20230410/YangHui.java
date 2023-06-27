package hw20230410;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        // 输入行数. 最小行数为 1
        int[][] mat = new int[new Scanner(System.in).nextInt()][];

        // 第 1 行
        mat[0] = new int[]{1};

        // 除去第 1 行, 每一行的数据
        for (int i = 1; i < mat.length; i++) {
            // 第 i + 1 行的数据大小
            mat[i] = new int[i + 1]; // 第 i + 1 行有 i + 1 个值

            // 保存数据
            mat[i][0] = 1; // 第 i + 1 行第 1 个数据
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][j] = mat[i - 1][j - 1] + mat[i - 1][j];
            }
            mat[i][mat[i].length - 1] = 1; // 第 i + 1 行的尾值
        }

        // 打印
        for (int i = 0; i < mat.length; i++) {
            printHang(i, mat);
        }
    }

    public static void printHang(int i, int[][] mat) {
        // 打印第 i + 1 行的前补空格
        for (int i1 = 0; i1 < mat.length - i - 1; i1++) {
            System.out.print("    ");
        }

        // 打印第 i + 1 行的每一个值和值间空格
        System.out.print(mat[i][0]);
        for (int j = 1; j < mat[i].length; j++) {
            for (int i2 = 0; i2 < 8 - String.valueOf(mat[i][j - 1]).length(); i2++) {
                System.out.print(' ');
            }
            System.out.print(mat[i][j]);
        }
        System.out.println();
    }

}