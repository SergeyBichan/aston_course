package lesson_5.iostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello Java world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("src/text3.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        //Using java.nio

        Charset charset = StandardCharsets.ISO_8859_1;
        Path path = Paths.get("src/text4.txt");

        try {
            Files.writeString(path, text, charset);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
