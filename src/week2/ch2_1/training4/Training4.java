package week2.ch2_1.training4;

// 여기에 Character 클래스를 선언하고, 클래스 내부에 멤버 변수를 추가해 주세요.
class Character {
    public String name;
    public String nickname;
    public int HP = 100;
    public int AP;
    public String[] inventory = {"물약", "칼", "갑옷"};
}

public class Training4 {
    public static void main(String args[]) {
        Character ch = new Character();

        ch.name = "Elice";
        ch.nickname = "Hellobit";

        System.out.println("ch.name: " + ch.name);
        System.out.println("ch.nickname: " + ch.nickname);
        System.out.println("ch.HP: " + ch.HP);
        System.out.println("ch.AP: " + ch.AP);
        System.out.print("ch.inventory: ");
        for(int i = 0; i < ch.inventory.length; i++)
            System.out.print(ch.inventory[i] + ", ");
    }
}