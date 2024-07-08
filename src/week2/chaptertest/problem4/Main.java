package week2.chaptertest.problem4;

public class Main {
    public static void main(String args[]) {
        Archer archer = new Archer("체셔");
        Wizard wizard = new Wizard("도도새");

        System.out.println(archer);
        System.out.println(wizard);
        
        wizard.attack(archer);
        wizard.setMP(20);
        wizard.attack(archer);
        System.out.println(archer);
	}
}