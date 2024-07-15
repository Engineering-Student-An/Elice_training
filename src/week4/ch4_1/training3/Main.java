package week4.ch4_1.training3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inputFilename = "src/week4/ch4_1/training3/Hello.txt";
        System.out.println("파일 내용: " + readFileContent(inputFilename));
    }

    public static String readFileContent(String inputFilename) {
        // 지시 사항에 따라 코드를 작성해 보세요.
        StringBuilder sb = new StringBuilder();
        try(FileInputStream fis = new FileInputStream(inputFilename)) {
            int i;
            while( (i = fis.read()) != -1) {
                sb.append((char) i);
            }
        } catch(FileNotFoundException e) {
            return "파일을 찾을 수 없습니다.";
        } catch (IOException e) {
            return "파일 입출력 시 문제가 발생했습니다.";
        }

        return sb.toString();
    }
}
