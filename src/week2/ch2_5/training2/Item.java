package week2.ch2_5.training2;

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
        StringBuilder sb = new StringBuilder();
        
        sb.append("====================\n");
        sb.append("아이템 설명\n");
        sb.append("이름: " + this.name + "\n");
        sb.append("설명: " + this.description + "\n");
        sb.append("====================\n");

        return sb.toString();
    }
}