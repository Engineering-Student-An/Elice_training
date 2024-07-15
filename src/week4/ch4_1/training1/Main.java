package week4.ch4_1.training1;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String inputData = "Hello, Wonder!";
        String inputFilename = "./Hello.txt";

        // 지시 사항에 따라 코드를 입력해 보세요.
//        FileOutputStream fos = null;
//        try{
//            fos = new FileOutputStream(inputFilename);
//            fos.write(inputData.getBytes());
//            System.out.println("파일에 데이터가 성공적으로 입력되었습니다.");
//            System.out.println(inputFilename);
//            System.out.println(inputData);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        try (FileOutputStream fos = new FileOutputStream(inputFilename)){
            fos.write(inputData.getBytes());
            System.out.println("파일에 데이터가 성공적으로 입력되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}