package hw20230625.teachCode;

import java.util.Arrays;

/*
ֱ�Ӳ�������
 */

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // ��ǰ, ����Ϊ [0, i) ��������
            int temp = nums[i]; // �ڱ���ȡ����Ԫ��. �� nums[i] ��ֵȡ��
            int j = i - 1;
            // j �����Ѿ����������
            while (j >= 0 && nums[j] > temp) { // nums[j] > temp Ϊ true ���ʾ temp Ӧ�ò��� nums[j] ֮ǰ (������ nums[j] ������)
                nums[j + 1] = nums[j]; // nums[j] ����һλ
                j--;
            }
            nums[j + 1] = temp;
            // ��ǰ, ����Ϊ [0, i] ��������
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 1, 4, 8, 6, 2, 7, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
