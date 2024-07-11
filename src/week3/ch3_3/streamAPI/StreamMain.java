package week3.ch3_3.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        List<Customer> customers = List.of(new Customer("name1", 10),
                new Customer("name2", 20), new Customer("name3", 50),
                new Customer("name4", 40), new Customer("name5", 30));


        // 1. 30살 이상 2. 나이 오름차순 3. 이름만 출력
        List<String> customerNames = customers.stream()
                .filter(customer -> customer.getAge() >= 30)
                .sorted()
//                .forEach(customer -> System.out.println(customer.getName()));
                .map(Customer::getName)
                .collect(Collectors.toList());

        for (String customerName : customerNames) {
            System.out.println("customerName = " + customerName);
        }
    }
}
