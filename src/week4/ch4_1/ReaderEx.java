package week4.ch4_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderEx {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/week4/ch4_1/input.txt";
        try (FileReader reader = new FileReader(filePath)){
//            while(true) {
//                int read = reader.read();
//                if(read == -1) break;
//                System.out.println("read = " + read);
//                System.out.println("(char)read = " + (char) read);
//            }

            char[] cbuf = new char[10];
            System.out.println("reader.read(cbuf) = " + reader.read(cbuf));

            System.out.println("Arrays.toString(cbuf) = " + Arrays.toString(cbuf));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
