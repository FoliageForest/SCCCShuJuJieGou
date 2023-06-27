package hw20230625.teachCode;

import java.util.Arrays;

/*
ð������
 */

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) { // ������ѭ��������ȷ���Ŷ�����
            for (int j = 0; j < n - i - 1; j++) { // ���ڱȽ����ڵ�����Ԫ��
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j]; // �ڱ�, ��¼�Ƚϵ�����Ԫ�ص�ǰһ��Ԫ��
                    nums[j] = nums[j + 1]; // ����һ��Ԫ�ص�ֵ��ֵ��ǰһ��Ԫ��
                    nums[j + 1] = temp; // �����Ԫ�ؼ�¼���Ԫ�ص�����
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 1, 4, 8, 6, 2, 7, 1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
