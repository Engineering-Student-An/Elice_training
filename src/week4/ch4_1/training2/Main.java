package week4.ch4_1.training2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    
        String sourceFilePath = System.getProperty("user.dir") + "/image.png";
        String destinationFilePath = System.getProperty("user.dir") + "/copied-image.png";

        
        // 지시 사항을 참고하여 코드를 작성해 보세요. 
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(sourceFilePath);
//            byte[] bytes = fis.readAllBytes();
//            FileOutputStream fos = null;
//            try {
//                fos = new FileOutputStream(destinationFilePath);
//                fos.write(bytes);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                fos.close();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try (FileInputStream fis = new FileInputStream(sourceFilePath)) {
            byte[] bytes = fis.readAllBytes();

            try (FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
                fos.write(bytes);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}