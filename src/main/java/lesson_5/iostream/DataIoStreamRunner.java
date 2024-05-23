package lesson_5.iostream;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import static java.nio.file.Files.writeString;

public class DataIoStreamRunner {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        // запись в файл
        writeDataToFile(tom);

        // обратное считывание из файла
        readDataFromFile();

        readDataFromFileByNio();
        writeDataToFileByUsingNio(tom);
    }

    private static void writeDataToFile(Person tom) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/data.bin"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readDataFromFile() {
        try (DataInputStream dos = new DataInputStream(new FileInputStream("src/data.bin"))) {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //using nio

    private static void readDataFromFileByNio() {

        try (FileChannel channel = new FileInputStream("src/text6.txt").getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            channel.read(buffer);
            buffer.flip();
            CharBuffer charBuffer = Charset.defaultCharset().decode(buffer);
            String str = charBuffer.toString();
            String[] tom = str.split(" ");
            String name = tom[1];
            int age = Integer.parseInt(tom[3]);
            double height = Double.parseDouble(tom[5]);
            boolean married = Boolean.parseBoolean(tom[7]);
            System.out.printf("\nName: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void writeDataToFileByUsingNio(Person person) {
        Path path = Paths.get("src/text6.txt");
        String toFile = null;
        if (Objects.nonNull(person)) {
            String name = person.name;
            int age = person.age;
            double height = person.height;
            boolean married = person.married;
            toFile = "Name: " + name + " Age: " + age + " Height: " + height + " Married: " + married;
        }

        try {
            writeString(path, toFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                '}';
    }
}
