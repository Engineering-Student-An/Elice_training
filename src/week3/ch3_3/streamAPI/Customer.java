package week3.ch3_3.streamAPI;

public class Customer implements Comparable<Customer>{

    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
