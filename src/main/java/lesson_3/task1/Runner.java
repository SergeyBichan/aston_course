package lesson_3.task1;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Map<String, String> hashMap = new HashMap<>();

        arrayList.add("bb");
        arrayList.add(0, "aa");
        arrayList.add("bb");
        arrayList.add("bb");
        arrayList.add("bb");
        arrayList.add("bb");
        arrayList.add((arrayList.size()/2 + 1), "cc");

        System.out.println(arrayList);

        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);


        linkedList.add("aa");
        linkedList.add("bb");
        linkedList.add("cc");
        linkedList.add("dd");
        linkedList.add("ee");

        linkedList.add(0, "ff");
        linkedList.add(linkedList.size()/2 + 1, "middle");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);

        hashMap.put("key1","value1");
        hashMap.put("key2","value1");
        hashMap.put("key3","value1");
        hashMap.put("key4","value1");
        hashMap.put("key5","value1");

        System.out.println(hashMap);

        hashMap.put("key3","value3");
        System.out.println(hashMap);

        hashMap.remove("key4");
        System.out.println(hashMap);

        hashMap.clear();
        System.out.println(hashMap);
    }
}
