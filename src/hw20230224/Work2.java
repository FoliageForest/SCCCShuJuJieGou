package hw20230224;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            int temp = y;
            y = z;
            z = temp;
        }
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println(z + ", " + y + ", " + x);
    }
}
