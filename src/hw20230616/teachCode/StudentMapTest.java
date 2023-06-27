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

        // =============== СС�ָ���
        Map<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("Ӣ��", stu1);
        studentHashMap.put("��ѧ", stu2);
        studentHashMap.put("��ѧ", stu3);
        System.out.println("HashMap.size(): " + studentHashMap.size());

        // =============== СС�ָ���
        System.out.print("foreach ���� HashMap ��Ӧ keySet() ������ȡ�������м�:");
        for (String key : studentHashMap.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.println();

        // =============== СС�ָ���
        System.out.print("\n����ʹ�� Iterator ���� keySet, ");
        Iterator<String> iterator = studentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("key: " + next + ", value: " + studentHashMap.get(next));
        }
        System.out.println();

        // =============== СС�ָ���
        System.out.print("�ж� key �Ƿ����, ��������Ҷ�Ӧ value, ");
        String key = "��ѧ";
        if (studentHashMap.containsKey(key)) {
            Student student = studentHashMap.get(key);
            System.out.println("key: " + key + ", value: " + student);
        }
        System.out.println();

        // =============== СС�ָ���
        System.out.print("ʹ�� remove ɾ�� Map ��һ����¼, ");
        if (studentHashMap.containsKey(key)) {
            Student remove = studentHashMap.remove(key);
            System.out.println("ɾ������Ϣ: key: " + key + ", value: " + remove.getName());
        }
        System.out.println();

        // =============== СС�ָ���
        System.out.println("��ȡ��ʹ�� HashMap �� entrySet, ");
        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator2 = entries.iterator();
        if (iterator2.hasNext()) {
            Map.Entry<String, Student> next = iterator2.next();
            System.out.println("key: " + next.getKey() + ", value: " + next.getValue());
        }
        System.out.println();
    }
}
