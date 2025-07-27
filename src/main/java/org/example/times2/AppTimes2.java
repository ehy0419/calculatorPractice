package org.example.times2;

import java.util.Scanner;

public class AppTimes2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        Calculator2 cal2 = new Calculator2();

        /// 양의 정수 입력 받기
        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc2.nextInt();
            if (firstNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.print("두 번재 숫자를 입력하세요: ");
            int secondNumber = sc2.nextInt();
            if (secondNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            ///  사칙연산 기호 입력받기
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc2.next().charAt(0);

            double result = cal2.calculateMachine(firstNumber, secondNumber, operator);
            // cal2 스캐너 객체.
            // calcultaeMachine Calcultor2 클래스의 사칙연산 메서드

            System.out.println("결과 : " + result);
            // result Calcultor2 클래스 연산값 가져오기


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc2.next();
            if ("exit".equals(answer)) {
                break;
            }



            ///  차이점 확인하기
//            if ("exit".equals(answer)) {
//                break;
//            }

//            if ("exit".equalsIgnoreCase(answer)) {
//                break;
//            }

//            if (answer.equals("exit")) {
//                break;
//            }

//            if (answer.equalsIgnoreCase("exit")) {
//                break;
//            }
        }
    }
}
