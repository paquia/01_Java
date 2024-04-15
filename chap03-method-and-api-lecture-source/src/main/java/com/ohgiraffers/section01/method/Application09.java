package com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 필기.
        *   다른 클래스에 작성한 메소드 호출
        *  */

        /* 필기. 최댓값과 최솟값을 비교할 두 정수를 변수로 선언 */
        int first = 100;
        int second = 50;

        /* 목차. 1. non-static method 의 경우 */
        /* 필기.
        *   클래스가 다르더라도 사용하는 방법은 동일하다.
        *   클래스명 사용할이름 = new 클래스명();
        *  */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);

        System.out.println("두 수 중 최솟값은? : " + min);

        /* 목차. 2. static 메소드 인 경우 */
        /* 필기. 다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기술해야 한다. */
        int max = Calculator.maxNumberOf(first, second);
        System.out.println(Calculator.maxNumberOf(first, second));

        System.out.println("max : " + max);

    }

}
