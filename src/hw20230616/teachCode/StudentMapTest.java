package hw20230616.teachCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentMapTest {
    public static void main(String[] args) {
        Student stu1 = new Student("Li Hua", 'M');
        Student stu2 = new Student("Xiao Ming", 'M');
        Student stu3 = new Student("Xiao Hong", 'W');

        // =============== 小小分割线
        Map<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("英语", stu1);
        studentHashMap.put("数学", stu2);
        studentHashMap.put("数学", stu3);
        System.out.println("HashMap.size(): " + studentHashMap.size());

        // =============== 小小分割线
        System.out.print("foreach 遍历 HashMap 对应 keySet() 方法获取到的所有键:");
        for (String key : studentHashMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();

        // =============== 小小分割线
        System.out.print("\n尝试使用 Iterator 遍历 keySet, ");
        Iterator<String> iterator = studentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("key: " + next + ", value: " + studentHashMap.get(next));
        }
        System.out.println();

        // =============== 小小分割线
        System.out.print("判断 key 是否存在, 存在则查找对应 value, ");
        String key = "数学";
        if (studentHashMap.containsKey(key)) {
            Student student = studentHashMap.get(key);
            System.out.println("key: " + key + ", value: " + student);
        }
        System.out.println();

        // =============== 小小分割线
        System.out.print("使用 remove 删除 Map 的一条记录, ");
        if (studentHashMap.containsKey(key)) {
            Student remove = studentHashMap.remove(key);
            System.out.println("删除的信息: key: " + key + ", value: " + remove.getName());
        }
        System.out.println();

        // =============== 小小分割线
        System.out.println("获取和使用 HashMap 的 entrySet, ");
        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator2 = entries.iterator();
        if (iterator2.hasNext()) {
            Map.Entry<String, Student> next = iterator2.next();
            System.out.println("key: " + next.getKey() + ", value: " + next.getValue());
        }
        System.out.println();
    }
}
