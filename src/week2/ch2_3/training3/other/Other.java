package week2.ch2_3.training3.other;

import week2.ch2_3.training3.Character;

public class Other {
    public static void main(String[] args) {
        // public class, constructor
        Character ch = new Character("캐터필러", "Caterpillar", 50);

        // 아래 4가지 메서드 / 멤버 변수의 접근 제어자를 확인해보고, 오류가 발생하는 메서드를 주석 처리해 주세요.
        // public
        ch.printDashboard();
        // protected
        //System.out.println(ch.isInventoryEmpty());
        // (default)
        //ch.increaseStat();
        // private
        //System.out.println(ch.name);
    }
}