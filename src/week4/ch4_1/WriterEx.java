package week4.ch4_1;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") +  "/src/week4/ch4_1/output.txt";
        try (FileWriter writer = new FileWriter(filePath)){
            String content = "hello!\n안녕하세요!";

            writer.write(content,0,6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
