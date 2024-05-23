package lesson_5.iostream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamRunner {

    public static void main(String[] args) {

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String text = "Hello World!";
            byte[] buffer = text.getBytes();
            baos.write(buffer);
            // превращаем массив байтов в строку
            System.out.println(baos);

            // получаем массив байтов и выводим по символьно
            byte[] array = baos.toByteArray();
            for (byte b : array) {
                System.out.print((char) b);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



        //Using nio
        String text = "Hello World!";
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());

        Charset charset = StandardCharsets.UTF_8;
        CharsetDecoder decoder = charset.newDecoder();

        try {
            String result = decoder.decode(buffer).toString();
            System.out.println("\n" + result);
        } catch (CharacterCodingException e) {
            System.out.println(e.getMessage());
        }

    }
}
