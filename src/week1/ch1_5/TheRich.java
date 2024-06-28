package week1.ch1_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheRich {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월");
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException {



        // 게임 시작 단계
        System.out.println("💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰");
        System.out.println("당신의 자산 관리 능력은 어느정도 입니까?");
        System.out.println("10억 부자가 되어 인생을 성공해보세요!");
        System.out.println("💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰");

        // 정보 초기화
        Person person = new Person();
        person.setInitialValue();
        System.out.println();

        // 날짜 변수 초기화
        LocalDate date = LocalDate.of(2024,6, 1);

        // 시작
        while(true) {
            // 탈출문 구현 (선택 x)
            if(person.money <= 0) {     // 파산 => 종료
                printEnd("이번 생은 글렀습니다.. 다시 도전해 보세요!");
                break;
            } else if(person.money >= 1000000000) { // 10억 달성 => 종료
                printEnd("백억부자가 되었습니다!! 축하합니다.");
                break;
            } else if(person.age >= 100) {
                printEnd("다가오는 죽음을 늦출 수 없었습니다..");
                break;
            }

            // 1초 로딩
            Thread.sleep(1000);

            System.out.println();
            System.out.println();
            System.out.println("한 달이 흘렀습니다...");
            // 한 달 지남
            date = plusMonth(date, person);

            // 상태 출력
            printInfo(date, person);

            // 선택문 출력
            boolean exit = false;
            if(person.age < 20) {
                exit = printKidChoices(person);
            } else {
                exit = printAdultChoices(person);
            }
            if(exit) {
                printEnd("게임 종료를 선택하셨습니다.");
                break;
            }

        }
    }

    private static LocalDate plusMonth(LocalDate date, Person person) {

        if(date.getYear() != date.plusMonths(1).getYear()) {
            person.nextYear();
        }

        return date.plusMonths(1);

    }

    private static void printEnd(String message) {
        System.out.println(message);
        System.out.println("게임을 종료합니다.");
    }

    private static void printInfo(LocalDate date, Person person) {
        System.out.println("💰💰💰💰💰 " +date.format(formatter) + " 💰💰💰💰💰");
        person.printInfo();
        System.out.println("💰💰💰💰💰💰💰💰💰💰💰💰💰💰💰");
        System.out.println();
    }

    private static boolean printKidChoices(Person person) {

        int choice;
        while(true){
            System.out.println("이번 달에는 무엇을 하시겠습니까?");
            System.out.println("        1: 친구와 내기 (최대 10만원, 2배 고정)");
            System.out.println("        2: 저금 (30% 증가)");
            System.out.println("        0: 게임종료");
            System.out.print("입력 >> ");
            choice = scanner.nextInt();
            if(choice == 1) {
                int money;
                System.out.println("친구와 내기를 선택하셨습니다.");
                System.out.print("금액을 입력해주세요. (최대 10만원) >> ");
                money = scanner.nextInt();
                if(money > 100000 || money > person.money) {
                    System.out.println("잘못된 입력입니다. 선택지를 다시 골라주세요.");
                } else {
                    person.invest(money, 2, "내기");
                    return false;
                }

            } else if(choice == 2) {
                System.out.println("저축을 선택하셨습니다. 보유 금액이 30% 증가합니다.");
                person.saving(person.money, 0.3);
                return false;
            } else if(choice == 0) {
                return true;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }


    }

    private static boolean printAdultChoices(Person person) {
        int choice;
        while(true){
            System.out.println("이번 달에는 무엇을 하시겠습니까?");
            System.out.println("        1: 투자 (제한 없음, 레버리지 입력)");
            System.out.println("        2: 저축 (10% 증가)");
            System.out.println("        3: 상사에게 아부 (성공: 월급 50% 상승, 실패: 월급 20% 감소)");
            System.out.println("        0: 게임종료");
            System.out.print("입력 >> ");
            choice = scanner.nextInt();
            if(choice == 1) {
                int money;
                System.out.println("투자를 선택하셨습니다.");
                System.out.print("금액을 입력해주세요.  >> ");
                money = scanner.nextInt();
                if(money > person.money) {
                    System.out.println("잘못된 입력입니다. 선택지를 다시 골라주세요.");
                } else {
                    System.out.print("레버리지를 입력해주세요. ex) 3 >> ");
                    int leverage = scanner.nextInt();
                    person.invest(money, leverage, "투자");
                    return false;
                }

            } else if(choice == 2) {
                System.out.println("저축을 선택하셨습니다. 보유 금액이 10% 증가합니다.");
                person.saving(person.money, 0.1);
                return false;
            } else if(choice == 3) {
                System.out.println("아부를 선택하셨습니다.");
                person.flattery();
                return false;
            } else if(choice == 0) {
                return true;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
