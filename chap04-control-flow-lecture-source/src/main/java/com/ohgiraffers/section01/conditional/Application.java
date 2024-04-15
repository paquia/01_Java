package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("신체질량지수 계산");
//        System.out.print("몸무게를 입력해주세요(kg) : ");
//        double weight = sc.nextDouble();
//        System.out.print("신장을 입력해주세요(m) : ");
//        double height = sc.nextDouble();
//
//        double result = weight / (height * height);
//
//        if(result < 20) {
//            System.out.println("당신은 저체중입니다.");
//        } else if(result >= 20 && result < 25) {
//            System.out.println("당신은 정상체중 입니다.");
//        } else if(result >= 25 && result < 30) {
//            System.out.println("당신은 과체중 입니다.");
//        } else if(result >= 30) {
//            System.out.println("당신은 비만입니다.");
//        }
//
//        System.out.println("프로그램을 종료합니다.");

        // 두 과목의 평균이 60점 이상이면 합격
        // 한 과목이라도 40점 미만이면 불합격

        Scanner sc = new Scanner(System.in);
        System.out.print("수학 점수를 입력해주세요 : ");
        int math = sc.nextInt();

        System.out.print("영어 점수를 입력해주세요 : ");
        int english = sc.nextInt();
        double avg = (math + english) / 2;

        if(avg < 60) {

            System.out.println("시험 불합격");
        } else if (english < 40 || math < 40){

            System.out.println("한 과목 과락으로 인한 시험 불합격");
        } else {
            System.out.println("시험에 합격했습니다.");
        }





    }

}
