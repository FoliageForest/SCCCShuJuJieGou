package hw20230625.teachCode;

import java.util.Arrays;

/*
直接插入排序
 */

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // 当前, 索引为 [0, i) 的数有序
            int temp = nums[i]; // 哨兵获取插入元素. 将 nums[i] 的值取出
            int j = i - 1;
            // j 遍历已经有序的数组
            while (j >= 0 && nums[j] > temp) { // nums[j] > temp 为 true 则表示 temp 应该插入 nums[j] 之前 (可能与 nums[j] 不相邻)
                nums[j + 1] = nums[j]; // nums[j] 后移一位
                j--;
            }
            nums[j + 1] = temp;
            // 当前, 索引为 [0, i] 的数有序
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 1, 4, 8, 6, 2, 7, 1};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
