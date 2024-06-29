package week1.ch1_3;

public class CallByReferenceEx {
    Person person;

    void change(Person person) {
        person.name = "Doe"; // 참조된 객체의 필드를 변경한다.
    }

    public static void main(String args[]) {
        CallByReferenceEx callByReferenceEx = new CallByReferenceEx();
        callByReferenceEx.person = new Person("John");

        System.out.println("변경 전: " + callByReferenceEx.person.name);
        callByReferenceEx.change(callByReferenceEx.person); // 참조에 의한 호출 => 변경 내용이 반영됨
        System.out.println("변경 후: " + callByReferenceEx.person.name);
    }
}

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
