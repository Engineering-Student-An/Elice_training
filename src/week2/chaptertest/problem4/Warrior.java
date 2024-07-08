package week2.chaptertest.problem4;

class Warrior extends Character {
    Warrior(String name) { super(name); }
    Warrior(String name, int AP) { super(name, AP); }
    Warrior(String name, String nickname) { super(name, nickname); }
    Warrior(String name, String nickname, int AP) { super(name, nickname, AP); }

    public String toString() {
        String result = "";
        
        result += "<용사>\n";
        result += super.toString();

        return result;
    }
}
