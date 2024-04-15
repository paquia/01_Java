package com.ohgiraffers.section01.method;

import java.util.Random;

public class TestMethod {

    public static void main(String[] args) {

        System.out.println("main 메소드 가장 먼저 시작함...");

        TestMethod test = new TestMethod();
        test.test1();

        System.out.println("main 메소드 동작 종료함... 프로그램을 종료합니다...");

    }

    public void test1() {

        System.out.println("test1 메소드 호출당함....");

        System.out.println("나는 난수를 발생시키는 코드를 진행할거야");
        Random random = new Random();
        int randomResult = random.nextInt(10);
        System.out.println(randomResult);

        System.out.println("랜덤한 난수를 발생 시켰으니 다른 메소드를 호출해볼까?");
        System.out.println("근데 이번에는 문자열을 하나 보내볼게");
        String hiHello = test2("안녕");

        System.out.println(hiHello);

        System.out.println("test1 메소드 동작 다 하고 종료됨...");

    }

    public String test2(String hi) {

        System.out.println("test2 메소드 호출당함....");

        System.out.println("test2 메소드가 수행하는 코드...");

        System.out.println("test2 메소드 동작 다 하고 종료됨....");

        String hello = "반가워";

        return hi + hello;
    }

}
