package laba8;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\MyFile1.txt"), "UTF-8"));

            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\MyFile2.txt"), "UTF-8"));

            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ": " + line);
                writer.newLine();
                lineNumber++;
            }

            System.out.println("Файл успешно обработан и записан в MyFile2.txt");

        } catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файловых потоков: " + e.getMessage());
            }
        }
    }
}
