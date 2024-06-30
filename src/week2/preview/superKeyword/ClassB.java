package week2.preview.superKeyword;

public class ClassB extends ClassA{

    public ClassB(int a) {
        // 부모의 기본 생성자 생략 가능
        // super();
        System.out.println("ClassB 생성자 : a=" + a);
    }

    public ClassB(int a, int b) {
        // 부모의 기본 생성자 생략 가능
        // super();
        System.out.println("ClassB 생성자 : a=" + a + " b=" + b);
    }
}
