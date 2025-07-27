package org.example.times2;

public class Calculator2 {

    public double calculate(int firstNumber, int secondNumber, char operator) {
        double result;

        // 계산기 사칙연산
        switch (operator) {
            case '+':
                System.out.println("결과: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("결과: " + (firstNumber - secondNumber));
                // () 처리 안 하니 연산자 - 계산 안됨
                break;
            case '*':
                System.out.println("결과: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두 번째 정수)가 0일 수 없습니다.");
                }
                System.out.println("결과: " + (firstNumber / secondNumber));
                break;
            default:
                throw new IllegalArgumentException("나눗셈 연산에서 분모(두 번째 정수)가 0일 수 없습니다.");
        }
        return result;
    }



}
