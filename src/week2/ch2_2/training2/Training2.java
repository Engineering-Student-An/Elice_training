package week2.ch2_2.training2;

class Character {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String name;
    public String nickname;
    public int HP = 100;
    public int AP = 10;
    public String[] inventory = { "물약", "칼", "갑옷" };

    public void printDashboard() {
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("별명: " + nickname);
        System.out.println("체력: " + HP);
        System.out.println("공격력: " + AP);
        System.out.println("====================");
    }

    public boolean isInventoryEmpty() {
        return inventory.length == 0;
    }

    // 여기에 메서드를 작성해 주세요.
    public void attack(Character ch) {
        ch.HP -= this.AP;
        System.out.println(this.name + "이(가) " + ch.name + "을(를) 일반 공격으로 "
                + this.AP + "만큼 데미지를 입혔습니다!");
    }

    public String getNthItemFromInventory(int index) {
        return this.inventory[index];
    }
}

public class Training2 {
    public static void main(String args[]) {
        Character ch1 = new Character();
        Character ch2 = new Character();

        ch1.name = "헬로빗";
        ch1.nickname = "Hellobit";
        ch1.AP = 30;

        ch2.name = "캐터필러";
        ch2.nickname = "Caterpillar";

        ch2.AP = 50;

        ch1.printDashboard();
        ch2.printDashboard();


        ch1.attack(ch2);
        ch2.attack(ch1);

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch2.getNthItemFromInventory(2));
    }
}
