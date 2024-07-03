package week2.ch2_3.training3;

public class Main {
    public static void main(String args[]) {
        Character ch = new Character("헬로빗", "Hellobit", 30);
        
        // 아래 4가지 메서드 / 멤버 변수의 접근 제어자를 확인해보고, 오류가 발생하는 메서드를 주석 처리해 주세요.
        // public
        ch.printDashboard();
        // protected
        System.out.println(ch.isInventoryEmpty());
        // (default)
        ch.increaseStat();
        // private
        //System.out.println(ch.name);
	}
}