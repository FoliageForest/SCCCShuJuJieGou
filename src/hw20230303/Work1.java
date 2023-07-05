package hw20230303;

import java.util.Scanner;

public class Work1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] names = initArray();
        System.out.print("请输入需要查找的值: ");
        int index = findValue(names, scanner.next());
        if (index == -1) {
            System.out.println("没找到");
        } else {
            System.out.println("找到的: " + index);
        }
    }

    public static String[] initArray() {
        System.out.print("输入数组个数: ");
        String[] strings = new String[scanner.nextInt()];
        for (int i = 0; i < strings.length; i++) {
            System.out.print("请输入下标为 " + i + " 的值: ");
            strings[i] = scanner.next();
        }
        return strings;
    }

    public static int findValue(String[] strings, String s) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
