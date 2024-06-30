package week2.preview.superKeyword;

public class ClassC extends ClassB{

    public ClassC() {
        // 부모 클래스 (ClassB) 에 기본 생성자가 없기 때문에 super() 사용 불가
        // 직접 부모 클래스의 생성자를 호출 해야 한다!!
        // super();

        super(10, 20); // 부모의 생성자 직접 호출
        System.out.println("ClassC 기본생성자");
    }
}
