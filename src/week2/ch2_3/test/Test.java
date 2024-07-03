package week2.ch2_3.test;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";

        Student student2 = student1;

        System.out.println("student1 참조값 = " + student1);
        System.out.println("student2 참조값 = " + student2);
    }

}


class Student {
    public String name;
}