package hw20230303;

import java.util.Arrays;
import java.util.Scanner;

public class Work2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = initArray();
        Arrays.sort(array);
        System.out.print("请输入要插入的值: ");
        array = insertValue(array, scanner.nextInt());
        System.out.print(Arrays.toString(array));
    }

    public static int[] initArray() {
        System.out.print("输入数组个数: ");
        int[] ints = new int[scanner.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            System.out.print("请输入下标为 " + i + " 的值: ");
            ints[i] = scanner.nextInt();
        }
        return ints;
    }

    public static int[] insertValue(int[] ints, int theValue) {
        int[] tempInts = new int[ints.length + 1];
        int index = ints.length; // 这个值最小为 0, 最大为原数组长度
        // 第一波循环
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] >= theValue) {
                index = i;
                break;
            }
            tempInts[i] = ints[i];
        }
        // 插入的值
        tempInts[index] = theValue;
        // 第二波循环. 当复制长度为 0 时, 数组下标可以为数组长度
        System.arraycopy(ints, index, tempInts, index + 1, ints.length - index);
        return tempInts;
    }

}
