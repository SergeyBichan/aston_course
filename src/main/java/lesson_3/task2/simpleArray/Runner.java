package lesson_3.task2.simpleArray;

public class Runner {
    public static void main(String[] args) {
        MySimpleArrayList<String> strings = new MySimpleArrayList<>();
        MySimpleArrayList<String> strings2 = new MySimpleArrayList<>();

//Добавление
        strings.add("Hello");
        strings.add("From");
        strings.add("First");
        strings.add("Array");

        strings2.add("Hello");
        strings2.add("From");
        strings2.add("Second");
        strings2.add("Array");
////SOUT
//        System.out.println(strings.get(0));
//        System.out.println(strings.get(1));
//        System.out.println(strings.get(2));
//        System.out.println(strings.get(3));
////Размер
//        System.out.println(strings.size());
////update
//        strings.update(1, "update");
//        System.out.println(strings.get(1));
////delete
//        System.out.println(strings.get(1));
//        strings.delete(1);
//        System.out.println(strings.get(1));

//addAll
        strings.addAll(strings2);
        System.out.println(strings.size());

        for (Object s : strings) {
            System.out.println(s);
        }

    }
}
