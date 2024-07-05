package week2.ch2_5.training3;

import week2.ch2_5.training3.Item;

public class Potion extends Item {
    // 지시사항에 맞게 Potion 클래스를 작성해 보세요.
    private int amount;
    private String type;

    public Potion(String name, String description, int amount, String type) {
        super(name, description);
        this.amount = amount;
        this.type = type;
    }

    @Override
    public void use(Character character) {
        if(this.type.equals("HP")) {
            character.setHP(character.getHP() + amount);
        } else if(this.type.equals("AP")) {
            character.setAP(character.getAP() + amount);
        }
    }
}