package com.codegym.list;

public class MylistTest {
    public static void main(String[] args) {
        Mylist<Integer> listInteger = new Mylist<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        for (int i = 0; i < listInteger.size; i++) {
            System.out.println("element " + i  + " " + listInteger.get(i));
        }

//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
