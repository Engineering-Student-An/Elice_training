package week4.ch4_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + "/src/week4/ch4_1/input.txt";

        // read()
//        try (InputStream inputStream = new FileInputStream(filePath)) {
//            while(true) {
//                int readData = inputStream.read();
//                if(readData == -1) {
//                    System.out.println("끝");
//                    break;
//                }
//                System.out.println("readData = " + readData);
//                System.out.println("(char)readData = " + (char) readData);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // read(byte[] b)
//        try(InputStream inputStream = new FileInputStream(filePath)) {
//            byte[] byteArr = new byte[20];
//            int read = inputStream.read(byteArr); // 반환값 : 읽은 바이트 수
//            System.out.println("read = " + read);
//
//            System.out.println("String(byteArr) = " + new String(byteArr,0,read));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // read(byte[] b, int off, int len)
        try(InputStream inputStream = new FileInputStream(filePath)) {
            byte[] byteArr = new byte[10];
            int read = inputStream.read(byteArr, 2, 4);
            System.out.println("read = " + read);

            System.out.println("String(byteArr) = " + new String(byteArr));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
