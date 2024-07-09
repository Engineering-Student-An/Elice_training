package week3.ch3_2.generics;

import java.util.ArrayList;

public class Box <T>{
    private ArrayList<T> data = new ArrayList<>();

    public void addData(T data) {
        this.data.add(data);
    }

    public ArrayList<T> getData() {
        return this.data;
    }
}

class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("author = " + author);
    }
}

class Account {
    String name;
    int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("author = " + amount);
    }
}

class GenericMain {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addData(new Book("자바", "안창민"));
        bookBox.addData(new Book("자바2", "홍길동"));
        // 이미 bookBox 타입이 Book으로 정해졌으므로 다른 클래스의 인스턴스는 넣을 수 없음
        // bookBox.addData(new Account("신한", 10000));
        System.out.println("bookBox = " + bookBox);
        ArrayList<Book> data = bookBox.getData();
        for (Book book : data) {
            System.out.println("book = " + book);
            book.printInfo();
        }
        System.out.println("===============================");
        Box<Account> accountBox = new Box<>();
        accountBox.addData(new Account("신한", 1000));
        accountBox.addData(new Account("농협", 99999999));
        System.out.println("accountBox = " + accountBox);
        ArrayList<Account> data1 = accountBox.getData();
        for (Account account : data1) {
            System.out.println("account = " + account);
            account.printInfo();
        }

    }
}