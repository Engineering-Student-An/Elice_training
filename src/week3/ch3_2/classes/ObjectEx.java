package week3.ch3_2.classes;

import java.util.ArrayList;

public class ObjectEx {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println("arr.toString() = " + arr.toString());

        System.out.println("arr.clone() = " + arr.clone());
        ArrayList<Integer> arrCopy = (ArrayList<Integer>) arr.clone();
        System.out.println("arrCopy = " + arrCopy);
        System.out.println("arrCopy.equals(arr) = " + arrCopy.equals(arr));

        Object object = new Object();
        System.out.println("object = " + object);
        System.out.println("object.hashCode() = " + object.hashCode());
    }
}
