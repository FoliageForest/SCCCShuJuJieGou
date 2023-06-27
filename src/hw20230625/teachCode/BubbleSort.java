package hw20230625.teachCode;

import java.util.Arrays;

/*
冒泡排序
 */

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) { // 定义外循环，用于确定排多少趟
            for (int j = 0; j < n - i - 1; j++) { // 用于比较相邻的两个元素
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j]; // 哨兵, 记录比较的两个元素的前一个元素
                    nums[j] = nums[j + 1]; // 将后一个元素的值赋值给前一个元素
                    nums[j + 1] = temp; // 后面个元素记录大的元素的数据
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
