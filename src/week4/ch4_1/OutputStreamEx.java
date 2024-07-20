package week4.ch4_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/week4/ch4_1/output.txt";

        // write(int b)
//        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
//            String outputMessage = "OutputStream Example~";
//            byte[] bytes = outputMessage.getBytes();
//            for (byte b : bytes) {
//                outputStream.write(b);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // write(byte[] b)
//        try(FileOutputStream outputStream = new FileOutputStream(filePath)) {
//            byte[] bytes = "OutputStream Example 2 !!".getBytes();
//            outputStream.write(bytes);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // write(byte[] b, int off, int len)
        try(FileOutputStream outputStream = new FileOutputStream(filePath)) {
            byte[] bytes = "OutputStream Example 3 !!".getBytes();
            outputStream.write(bytes, 13, 9);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
