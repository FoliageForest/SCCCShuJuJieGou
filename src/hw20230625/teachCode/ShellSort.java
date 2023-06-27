package hw20230625.teachCode;

import java.util.Arrays;

/*
希尔排序
 */

public class ShellSort {
    public static void shellSort(int[] nums) {
        int gap = nums.length / 2; // 初始化步长
        while (gap > 0) {
            for (int i = gap; i < nums.length; i++) {
                int temp = nums[i];
                int j = i - gap;
                while (j >= 0 && nums[j] > temp) {
                    nums[j + gap] = nums[j];
                    j -= gap;
                }
                nums[j + gap] = temp;
            }
            gap /= 2; // 缩小步长
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 1, 4, 8, 6, 2, 7, 1};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
