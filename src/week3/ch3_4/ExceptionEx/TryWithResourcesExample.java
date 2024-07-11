package week3.ch3_4.ExceptionEx;

public class TryWithResourcesExample {
    public static void main(String[] args) {
    
        try(FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            throw new Exception();
            
        } catch (Exception e) {
            System.out.println("Exception processing code executed.");
        }
    }
}