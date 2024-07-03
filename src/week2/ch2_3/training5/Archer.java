package week2.ch2_3.training5;

class Archer extends Character {
    // arrowNum 멤버 변수를 추가해 주세요.
    private int arrowNum = 10;

    Archer(String name) { super(name); }
    Archer(String name, int AP) { super(name, AP); }
    Archer(String name, String nickname) { super(name, nickname); }
    Archer(String name, String nickname, int AP) { super(name, nickname, AP); }

    // getter, setter 메서드를 추가해 주세요.
    public int getArrowNum() {
        return this.arrowNum;
    }
    public void setArrowNum(int arrowNum) {
        if(arrowNum < 0) {
            this.arrowNum = 0;
        } else {
            this.arrowNum = arrowNum;
        }        
    }
    // attack 메서드를 오버라이딩하여 다시 작성해 주세요.
    public void attack(Character target) {
        if(this.getArrowNum() == 0) {
            System.out.println(this.getName() + "의 화살 개수가 부족하여 공격하지 못했습니다.");
        } else {
            super.attack(target);
            this.setArrowNum(getArrowNum()-1);
            System.out.println(this.getName() + "의 화살이 " + this.getArrowNum() + "만큼 남아있습니다.");
        }
    }
    public String toString() {
        String result = "";
        
        result += "<궁수>\n";
        result += super.toString();

        return result;
    }
}
