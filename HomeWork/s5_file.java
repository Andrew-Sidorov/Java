package HomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.SocketTimeoutException; // записать слово TEST в файл 10 раз

public class s5_file {
    private static String txt;

    public static void main(String[] args) {
        Integer n = 10;
        String text = "TEST";
        String file_name = "s5_file.txt";
        File file = new File(s5_file.txt);
        try {
            FileWriter writer = new FileWriter(s5_file.txt, false);
            for (int i = 0; i < n; i++) {
                writer.write(text);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

}