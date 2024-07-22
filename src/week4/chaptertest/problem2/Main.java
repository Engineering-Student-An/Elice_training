package week4.chaptertest.problem2;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputData = "I hate test!";
        String inputFilename = "./Test.txt";

        // 지시 사항에 따라 코드를 입력해 보세요.
        String filePath = System.getProperty("user.dir") + "/src/week4/chaptertest/problem2/Test.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {

//            byte[] bytes = inputData.getBytes();
//            for (byte b : bytes) {
//                fileOutputStream.write(b);
//            }
            fileOutputStream.write(inputData.getBytes());
            System.out.println("파일에 데이터가 성공적으로 입력되었습니다.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
