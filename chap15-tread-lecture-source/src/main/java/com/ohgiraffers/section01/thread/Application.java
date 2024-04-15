package com.ohgiraffers.section01.thread;

public class Application {

    public static void main(String[] args) {

        /* 필기.
        *   프로세스와 스레드
        *   프로세스(process) 란?
        *   현재 실행중인 프로그램이라고 할 수 있다.
        *   즉, 사용자가 작성한 프로그램을 운영체제에 의해 메모리와 cpu 를 할당받아
        *   실행중인 것을 말한다.
        *
        *  필기.
        *   스레드(thread) 란?
        *   프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
        *   모든 프로세스에는 한 개 이상의 스레드가 존재하며
        *   두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 라고 한다.
        *
        *  필기.
        *   1. Thread 클래스를 상속받는 방법
        *   2. Runnable 인터페이스를 상속받는 방법
        *  */

        Car car = new Car();
        Tank tank = new Tank();
        Plane plane = new Plane();

        Thread t1 = car;
        Thread t2 = tank;
        // Runnable 을 상속 받은 클래스는 Thread 클래스의 생성자에
        // 인자로 인스턴스(plane) 전달해서 Thread 를 만들어야 한다.
        Thread t3 = new Thread(plane);

//        t1.run();
//        t2.run();
//        t3.run();

        t1.start();
        t2.start();
        t3.start();

    }

}
