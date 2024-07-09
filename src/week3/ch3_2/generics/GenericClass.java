package week3.ch3_2.generics;

public class GenericClass<T> {

    T ob;

    public GenericClass(T ob) {
        this.ob = ob;
    }

    public void printType() {
        System.out.println(ob.getClass().getName());
    }
}

class GenericClass2<T, V> {

    T ob;
    V ob2;

    public GenericClass2(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    public void printType() {
        System.out.println("ob type: " + ob.getClass().getName());
        System.out.println("ob2 type: " + ob2.getClass().getName());
    }
}

class Main {
    public static void main(String[] args) {

        GenericClass<Integer> generic1 = new GenericClass<>(100);
		generic1.printType();

        GenericClass<Double> generic2 = new GenericClass<>(3.14);
		generic2.printType();

        GenericClass2<String, Long> generic3 = new GenericClass2<>("Hello", 10L);
        generic3.printType();
    }
}