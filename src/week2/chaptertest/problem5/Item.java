package week2.chaptertest.problem5;

abstract public class Item {
    // 지시사항에 맞게 Item 클래스를 작성해 보세요.
    private String name;
    private String description;

    Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }
    
    abstract public void use(Character character);

    public String toString() {
        return "====================\n아이템 설명\n이름: " + this.name + "\n설명: " + this.description +    "\n====================\n";
    }
}