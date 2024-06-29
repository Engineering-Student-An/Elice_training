package week1.ch1_3;

public class CallByValueEx {
    int data = 50;

    void change(int data) {
        data = data + 100; // 이 변경은 로컬 변수에만 영향을 미친다.
    }

    public static void main(String args[]) {
        CallByValueEx callByValueEx = new CallByValueEx();
        System.out.println("변경 전: " + callByValueEx.data);
        callByValueEx.change(callByValueEx.data);   // 값에 의한 호출 => 변경결과가 반영되지 않음
        System.out.println("변경 후: " + callByValueEx.data);
    }
}
