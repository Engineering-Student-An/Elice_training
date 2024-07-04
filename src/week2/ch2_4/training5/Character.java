package week2.ch2_4.training5;

import java.util.ArrayList;

abstract public class Character {
    // 상수 값인 MAX_HP 멤버 변수를 추가해 주세요.

    private String name;
    private String nickname;
    private int HP;
    private int AP;
    private ArrayList<String> inventory = new ArrayList<String>();

    static private int characterNum = 0;
    static final public int MAX_HP = 100;

    private void addCharacterNum() {
        characterNum++;
        System.out.println("캐릭터가 한 명 추가되었습니다.");
    }

    static public int getCharacterNum() { return characterNum; }

    // 생성자 메서드
    public Character(String name) {
        this(name, "별명 없음", 10);
    }

    public Character(String name, int AP) {
        this(name, "별명 없음", AP);
    }

    public Character(String name, String nickname) {
        this(name, nickname, 10);
    }

    public Character(String name, String nickname, int AP) {
        this.name = name;
        this.nickname = nickname;
        // HP의 초기값을 MAX_HP로 설정해 주세요.
        this.HP = MAX_HP;
        this.AP = AP;
        addCharacterNum();
    }

    // getter 메서드
    public String getName() { return name; }
    public String getNickname() { return nickname; }
    public int getHP() { return HP; }
    public int getAP() { return AP; }

    // setter 메서드
    public void setName(String name) { this.name = name; }
    public void setNickName(String nickname) { this.nickname = nickname; }

    // HP가 MAX_HP보다 커지지 않도록 setHP 메서드를 수정해 주세요.
    public void setHP(int HP) {
        if(HP < 0) HP = 0;
        if(HP > MAX_HP) HP = MAX_HP;
        this.HP = HP;
    }

    public void setAP(int AP) {
        if(AP < 0) AP = 0;
        this.AP = AP;
    }

    // 일반 메서드
    public String toString() {
        String result = "";

        result += "====================\n";
        result += "이름: " + name + "\n";
        result += "별명: " + nickname + "\n";
        result += "체력: " + HP + "\n";
        result += "공격력: " + AP + "\n";
        result += "인벤토리: ";
        for(String item: inventory) result += item + " ";
        result += "\n====================\n";

        return result;
    }

    public void attack(Character target) {
        target.setHP(target.getHP() - AP);
        System.out.println(name + "이(가) " + target.getName() + "을(를) 일반 공격으로 " + AP + "만큼 데미지를 입혔습니다!");
    }

    abstract public void useSkill(Character target);

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + "이(가) " + item + " 아이템을 얻었습니다!");
    }

    public void giveItem(Character receiver, String item) {
        inventory.remove(item);
        receiver.addItem(item);
        System.out.println(name + "이(가) " + receiver.getName() + "에게 " + item + " 아이템을 주었습니다!");
    }

    public void useItem(String item) {
        inventory.remove(inventory.indexOf(item));
        System.out.println(name + "이(가) " + item + " 아이템을 사용했습니다!");
    }
}
