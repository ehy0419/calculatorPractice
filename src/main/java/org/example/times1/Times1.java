package org.example.times1;

import org.example.Calculator2;

import java.util.List;
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
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // 정수 숫자는 int 로
            int firstNumber = sc.nextInt();
            // firstNumber의 출처는 Calculator2 에서 매개변수 선언!
            if (firstNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            // secondNumber의 출처는 Calculator2 에서 매개변수 선언!
            if (secondNumber < 0) {
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = calculator.calculate(firstNumber, secondNumber, operator);

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if ("exit".equals(sc.next())) {
                break;
            }

            // 연산 결과 저장
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes 입력 시 삭제)");
            if ("yes".equals(sc.next())) {
                calculator.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (yes 입력 시 조회)");
            if ("yes".equals(sc.next())) {
                List<Double> resultList = calculator.getResultList();
                System.out.println("저장된 연산결과는 : " + resultList.toString());
            }
        }
    }
}
