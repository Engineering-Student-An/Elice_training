package week2.chaptertest.problem4;

class Wizard extends Character {
    // MP 멤버 변수를 추가해 주세요.
    private int MP;
    Wizard(String name) { super(name); }
    Wizard(String name, int AP) { super(name, AP); }
    Wizard(String name, String nickname) { super(name, nickname); }
    Wizard(String name, String nickname, int AP) { super(name, nickname, AP); }

    // getter, setter 메서드를 추가해 주세요.
    public int getMP() {
        return this.MP;
    }
    public void setMP(int MP) {
        if(MP < 0) {
            MP = 0;
        }
        this.MP = MP;
    }
    // attack 메서드를 오버라이딩하여 다시 작성해 주세요.
    @Override
    public void attack(Character target) {
        super.attack(target);
        if(this.getMP() == 0) {
            System.out.println(this.getName() + "의 MP가 모자라 마법 공격을 할 수 없습니다.");
        } else {
            target.setHP(target.getHP() - this.getMP());
            System.out.println(this.getName() + "이(가) " + target.getName() + "을(를) 마법의 힘으로 " + this.getMP() + "만큼 추가 데미지를 입혔습니다!");
        }
        
    }

    public String toString() {
        String result = "";
        
        result += "<마법사>\n";
        result += super.toString();

        return result;
    }
}
