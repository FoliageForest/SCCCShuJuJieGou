package hw20230410;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        // ��������. ��С����Ϊ 1
        int[][] mat = new int[new Scanner(System.in).nextInt()][];

        // �� 1 ��
        mat[0] = new int[]{1};

        // ��ȥ�� 1 ��, ÿһ�е�����
        for (int i = 1; i < mat.length; i++) {
            // �� i + 1 �е����ݴ�С
            mat[i] = new int[i + 1]; // �� i + 1 ���� i + 1 ��ֵ

            // ��������
            mat[i][0] = 1; // �� i + 1 �е� 1 ������
            for (int j = 1; j < mat[i].length - 1; j++) {
                mat[i][j] = mat[i - 1][j - 1] + mat[i - 1][j];
            }
            mat[i][mat[i].length - 1] = 1; // �� i + 1 �е�βֵ
        }

        // ��ӡ
        for (int i = 0; i < mat.length; i++) {
            printHang(i, mat);
        }
    }

    public static void printHang(int i, int[][] mat) {
        // ��ӡ�� i + 1 �е�ǰ���ո�
        for (int i1 = 0; i1 < mat.length - i - 1; i1++) {
            System.out.print("    ");
        }

        // ��ӡ�� i + 1 �е�ÿһ��ֵ��ֵ��ո�
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