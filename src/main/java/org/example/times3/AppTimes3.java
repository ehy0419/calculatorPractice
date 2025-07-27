package org.example.times3;

import java.util.List;
import java.util.Scanner;

public class AppTimes3 {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);

        Calculator3 calculator = new Calculator3();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc3.nextInt();
            if (firstNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc3.nextInt();
            if (secondNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc3.next().charAt(0);

            double result = calculator.calculate(firstNumber, secondNumber, operator);

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if ("exit".equals(sc3.next())) {
                break;
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes 입력 시 삭제)");
            if ("yes".equals(sc3.next())) {
                calculator.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (yes 입력 시 조회)");
            if ("yes".equals(sc3.next())) {
                List<Double> resultList = calculator.getResultList();
                System.out.println("저장된 연산결과는 : " + resultList.toString());
            }
        }
    }
}
