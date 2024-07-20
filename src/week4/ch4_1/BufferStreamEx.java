package week4.ch4_1;

import java.io.*;

public class BufferStreamEx {
    public static void main(String[] args) {

        String fileInputPath = System.getProperty("user.dir") +  "/src/week4/ch4_1/input.txt";
        String fileOutputPath = System.getProperty("user.dir") +  "/src/week4/ch4_1/output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInputPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutputPath))) {

            String inputString = bufferedReader.readLine();
            // 띄어쓰기로 구분
            String[] stringArr = inputString.split(" ");
            for (String s : stringArr) {
                bufferedWriter.write(s + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
