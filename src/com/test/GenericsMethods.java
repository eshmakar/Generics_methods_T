package com.test;

import java.util.ArrayList;

public class GenericsMethods {
    public static void main(String[] args) {
        ArrayList <Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(15);
        integerArrayList.add(25);
        integerArrayList.add(35);
        int elementTwo = SecondElement.getSecondElement(integerArrayList);//здесь вызывается этот метод, чтобы получить, и сохранить в качестве int второй элемент
        System.out.println(elementTwo);//выводит этот второй элемент
    }
}

class SecondElement{
    public static <T> T getSecondElement(ArrayList<T> al){ // метод шаблон, который будет определенного типа, на этом примере Integer. Здесь необходимо после <T> писать еще раз T, чтобы сообщить компилятору тип возвращаемого значения. В качествет параметра принимает ArrayList определенного типа
        return al.get(1);//возвращение второго элемента
    }
}
/*
OUTPUT:
25

*/
