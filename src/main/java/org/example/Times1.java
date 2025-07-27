package org.example;

import java.util.Scanner;

public class Times1 {
    public static void main(String[] args) {
        // new 이후 클래스 가져오기
        Scanner sc = new Scanner(System.in);

        // Calculator2 클래스 생성
        Calculator2 calculator = new Calculator2();

        // while (true) { - 반복문 내용 - } 반복문
        while (true) {
            // sout
            System.out.println("첫 번째 숫자를 입력하세요: ");
            // 정수 숫자는 int 로
            int firstNumber = sc.nextInt();
            // firstNumber의 출처는 Calculator2 에서 매개변수 선언!

            int secondNumber = sc.nextInt();
            // secondNumber의 출처는 Calculator2 에서 매개변수 선언!
        }
    }
}
