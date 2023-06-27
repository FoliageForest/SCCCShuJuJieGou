package hw20230317;

public class Test {
    public static void main(String[] args) {
        // T1
        System.out.println("============== T1:");
        String s1 = "hello, world!";
//        String s2 = new String("hello, world!");
//        String s3 = new String(s1);
        char[] chars = {'A', 'B', 'C'};
        String s4 = new String(chars);
        byte[] bytes = {97, 98, 99};
        String s5 = new String(bytes);
        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // T2
        System.out.println("============== T2:");
        String str1 = "hello, good, and, nice";
        String str2 = "the world";
//        String str3 = str1.substring(0, 7) + str2 + ", " + str1.substring(7);
        String str3 = str1.substring(0, 7).concat(str2).concat(", ").concat(str1.substring(7));
        System.out.println(str3);

        // T3
        System.out.println("============== T3:");
        StringBuffer stringBuffer = new StringBuffer(str3);
        System.out.println("\"" + stringBuffer + "\"");
//        int[] ints = new int[]{5, 16, 22, 27};
//        for (int i = 0; i < 4; i++) {
//            stringBuffer.delete(ints[i] - i, ints[i] - i + 1);
//        }
        int forEnd = stringBuffer.length();
        for (int i = 0; i < forEnd; ) {
            if (stringBuffer.charAt(i) == ',') {
                stringBuffer.delete(i, i + 1);
                forEnd--;
                continue;
            }
            i++;
        }
        System.out.println("\"" + stringBuffer + "\"");
        stringBuffer.append(" come on");
        System.out.println("\"" + stringBuffer + "\"");
        stringBuffer.insert(6, "everyone ");
        System.out.println("\"" + stringBuffer + "\"");
    }

}
