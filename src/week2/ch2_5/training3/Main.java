package week2.ch2_5.training3;

public class Main {
    public static void main(String args[]) {
        Warrior warrior = new Warrior("캐터필러", "Caterpillar", 30);
        Wizard wizard = new Wizard("도도새", "Dodo", 10);
        Item HPPotion = new Potion("회복포션", "HP를 10만큼 회복해준다.", 10, "HP");
        Item APPotion = new Potion("공격력포션", "AP를 20만큼 향상시킨다.", 20, "AP");

        warrior.addItem(HPPotion);
        wizard.addItem(HPPotion);

        warrior.addItem(APPotion);
        wizard.addItem(APPotion);

        wizard.setHP(50);
        System.out.println(warrior);
        System.out.println(wizard);

        wizard.useItem(HPPotion);
        System.out.println(wizard);

        warrior.useItem(APPotion);
        System.out.println(warrior);
	}
}