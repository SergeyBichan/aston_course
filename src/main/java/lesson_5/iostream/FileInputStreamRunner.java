package lesson_5.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputStreamRunner {
    public static void main(String[] args) {
//        readEachByte();
//        System.out.println("--------------------");
        readAllBytes();
        readAllBytesByNio();
        readEachByteByNio();

    }

    private static void readAllBytes() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("resources/text.txt");
            byte[] bytes = inputStream.readAllBytes();
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private static void readEachByte() {
        try (FileInputStream inputStream = new FileInputStream("resources/text.txt")) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    private static void readAllBytesByNio() {
        Path filePath = Paths.get("resources/text.txt");
        try {
            byte[] bytes = Files.readAllBytes(filePath);
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readEachByteByNio() {
        Path filePath = Paths.get("resources/text.txt");
        try (var inputStream = Files.newInputStream(filePath)) {
            byte[] bytes = new byte[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int bytesRead;
            while ((bytesRead = inputStream.read(bytes))!= -1) {
                stringBuilder.append(new String(bytes, 0, bytesRead));
            }
            System.out.println(stringBuilder.toString());
        } catch (IOException ex) {
            System.err.println("An error occurred while reading the file: " + ex.getMessage());
        }
    }
}
