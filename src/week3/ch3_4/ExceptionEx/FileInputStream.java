package week3.ch3_4.ExceptionEx;

public class FileInputStream implements AutoCloseable {
        private String file;

        public FileInputStream(String file) {
                this.file = file;
        }

        public void read() {
                System.out.println("Read " + file);
        }

        @Override
        public void close(){
                System.out.println(file + " is closed.");
        }
}