package week1.ch1_5;

import java.util.Random;
import java.util.Scanner;

public class Person {

    String name;
    int money;
    int age;

    int income;

    boolean goldSpoon;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // 초기 설정 메서드
    public void setInitialValue() throws InterruptedException {
        // 이름 입력
        System.out.println("당신의 이름은 무엇입니까?");
        System.out.print("입력 >> ");
        this.name = scanner.nextLine();

        System.out.println("당신은 19세 입니다.");

        // 초기 금액 설정
        this.money = 100000;
        this.age = 19;

        // 초기 수입 (용돈) 설정
        setIncome(200000, 50000);

        System.out.println("게임을 시작합니다!!");
    }



    // 정보 출력 메서드
    public void printInfo() {
        if(income!=0) {
            System.out.println((this.age < 20) ? "이번 달 용돈 (" + formatMoney(income) + ") 을 받았습니다." : "이번 달 월급 (" + formatMoney(income) + ") 을 받았습니다.");
            this.money += income;
        }

        System.out.print("이름 : " + this.name + " (" + this.age + "세) / ");
        if(age < 20) {
            System.out.println((this.goldSpoon) ? "금수저" : "흙수저");
        } else {
            System.out.println((this.goldSpoon) ? "대기업" : "중소기업");
        }
        System.out.println("보유 잔액 : " + formatMoney(this.money));
    }

    private String formatMoney(long amount) {
        if (amount >= 100000000) {
            return String.format("%d억 %d만 %d원", amount / 100000000, (amount % 100000000) / 10000, amount % 10000);
        } else if (amount >= 10000) {
            return String.format("%d만 %s원", amount / 10000, (amount % 10000 == 0) ? "" : String.format("%04d", amount % 10000));
        } else {
            return String.format("%d원", amount);
        }
    }


    // 1년 지남 => 나이 + 1, 수입 증가
    public void nextYear() {
        // 나이 증가
        this.age ++;
        // 성인이 되면 수입 재설정
        if(this.age == 20) {
            setIncome(5000000, 2000000);
        } else if(this.age>20){
            // 수입 증가
            increaseIncome();
        }
    }

    // 매 해 월급 상승 메서드
    public void increaseIncome() {
        System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
        System.out.println("새해가 밝았습니다. 월급이 10% 증가합니다!");
        System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
        System.out.println();
        this.income += (int) (this.income * 0.1);
    }

    // 수입 설정 메서드
    private void setIncome(int large, int small) {
        int randomSpoon = random.nextInt() % 100 + 1;
        if (randomSpoon <= 60) {
            this.income = large;

            System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
            System.out.println((this.age < 20) ? "당신은 금수저입니다!!" : "당신은 대기업에 취업했습니다!!");
            System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

            this.goldSpoon = true;
        } else {
            this.income = small;

            System.out.println("💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀");
            System.out.println((this.age < 20) ? "당신은 흙수저입니다.." : "당신은 중소기업에 취업했습니다..");
            System.out.println("💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀");
            this.goldSpoon = false;
        }
    }

    public void invest(int price, int leverage, String message) {
        int rand = random.nextInt() % 100 + 1;
        if(rand <= 50) {
            System.out.println(message + "에 성공하셨습니다!");
            System.out.println("보유금액이 " + formatMoney(price * leverage) + "만큼 증가합니다!");
            this.money += price * leverage;
            System.out.println("현재 보유 금액 : " + formatMoney(this.money));
        } else {
            System.out.println(message + "에 실패하셨습니다..");
            System.out.println("보유금액이 " + formatMoney(price * leverage) + "만큼 감소합니다!");
            this.money -= price * leverage;
            System.out.println("현재 보유 금액 : " + formatMoney(this.money));
        }
    }

    public void saving(int price, double leverage) {
        System.out.println("보유 금액을 모두 저축 하셨습니다");
        System.out.println("보유금액이 " + formatMoney((int) (price * leverage)) + "만큼 증가합니다!");
        this.money += price * leverage;
        System.out.println("현재 보유 금액 : " + formatMoney(this.money));
    }

    public void flattery() {
        int rand = random.nextInt() % 100 + 1;
        if(rand <= 40) {
            System.out.println("아부에 성공하셨습니다!");
            System.out.println("월급이 50% 증가합니다!");
            this.income += (int) (income * 0.5);
            System.out.println("현재 월급 : " + formatMoney(this.income));
        } else {
            System.out.println("아부에 실패하셨습니다..");
            System.out.println("월급이 20% 감소합니다!");
            this.income -= (int) (income * 0.2);
            System.out.println("현재 월급 : " + formatMoney(this.income));
        }
    }
}
