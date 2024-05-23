package lesson_5.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOutputStreamRunner {
    public static void main(String[] args) throws IOException {
        System.out.println();
        try (FileOutputStream outputStream = new FileOutputStream("resources/text2.txt", true)) {
            String value = "Hello World2!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }

        //using nio

        try {
            String value = "Hello World2!";
            Path path = Paths.get("resources/text2.txt");
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.writeString(path, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
