package com.anjali.Generics;

public class GenericsDemo {

    public static void examples() {
        GenericList<Integer> integerList = new GenericList<>();
        integerList.add(1);
//        integerList.add("hi"); // only int values can br added
//        System.out.println(integerList);

        int getNumber = integerList.get(0);
//        System.out.println(integerList.get(0));
        System.out.println(getNumber); // Java compiler does boxing and unboxing with primitive type and its wrapper class
    }
}
