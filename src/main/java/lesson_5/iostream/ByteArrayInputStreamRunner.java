package lesson_5.iostream;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ByteArrayInputStreamRunner {

    public static void main(String[] args) {

        readAllBytes();

        readFiveChars();

        readAllBytesUsingNio();

        readFiveCharsUsingNio();
    }

    private static void readAllBytes() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {
            System.out.println(b);
        }
    }

    private static void readFiveChars() {
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.println((char) c);
        }
    }

    //using java nio
    private static void readAllBytesUsingNio() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteBuffer byteBuffer = ByteBuffer.wrap(array1);
        System.out.println("Using java nio: ");
        while (byteBuffer.hasRemaining()) {
            int temp = byteBuffer.get();
            System.out.printf(temp + " ");
        }
    }

    private static void readFiveCharsUsingNio() {
        String text = "Hello world!";
        char[] chars = text.toCharArray();

        CharBuffer buffer = CharBuffer.wrap(chars);

        int limit = Math.min(buffer.remaining(), 5);
        buffer.limit(limit);

        System.out.println();
        for (int i = 0; i < limit; i++) {
            System.out.print(buffer.get(i));
        }
        System.out.println();
    }
}
