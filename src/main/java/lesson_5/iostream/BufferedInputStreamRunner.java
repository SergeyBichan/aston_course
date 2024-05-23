package lesson_5.iostream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

public class BufferedInputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {
            int c;
            while ((c = bis.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        //Using nio

        ByteBuffer byteBuffer = ByteBuffer.wrap(text.getBytes());
        for (int i = 0; i < byteBuffer.remaining(); i++) {
            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(byteBuffer);
            System.out.printf(charBuffer.toString());
        }
        byteBuffer.clear();
    }
}
