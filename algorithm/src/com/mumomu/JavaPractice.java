package com.mumomu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

class Person{
    int gender;
    int power;

    public Person(int gender, int power) {
        this.gender = gender;
        this.power = power;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void walk(){
        System.out.println("person walk");
    }
}
class Hero extends Person {
    String name;
    int age;

    public Hero(int gender, int power, String name, int age) {
        super(gender, power);
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("Hero walk");
    }
}

class Villain extends Person{
    String name;
    int age;

    public Villain(int gender, int power, String name, int age) {
        super(gender, power);
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("Villain walk");
    }
}

public class JavaPractice {
    static int n;
    static int[][] arr = new int[1005][1005];

    ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Person person = new Hero(1,1,"asd",1);
        Person person2 = new Villain(1,1,"asd",1);

        person.walk();
        person2.walk();

        Person hero = new Person(1,1);

        hero.walk();
//        Scanner sc = new Scanner(System.in);
//        StringBuilder rst = new StringBuilder(sc.nextLine());
//
//        toUpper(rst);
//        System.out.println(rst);
//        toUpper(rst);
//        System.out.println(rst);

        // NonStaticMethod();
        // non static method 호출
//        JavaPractice main = new JavaPractice();
//        main.NonStaticMethod();
    }

    public static void toUpper(StringBuilder str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str.setCharAt(i, (char) ('A' + (str.charAt(i) - 'a')));
            }
    }

    // 메인 메서드는 static 메서드만 호출할 수 있기 때문에 에러
    // 객체 생성 후 메서드 호출
    public void NonStaticMethod(){
        System.out.println("non static method 호출");
    }
}
