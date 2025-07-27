package org.example.times2;

import java.util.ArrayList;
import java.util.List;

public class Calculator2 {

    private final List<Double> resultList = new ArrayList<>();

    public double calculateMachine(int firstNumber, int secondNumber, char operator) {
        double result;

        // 계산기 사칙연산
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
//                System.out.println("결과: " + (firstNumber + secondNumber));
                break;
            case '-':
                result = firstNumber - secondNumber;
//                System.out.println("결과: " + (firstNumber - secondNumber));
                // () 처리 안 하니 연산자 - 계산 안됨
                break;
            case '*':
                result = firstNumber * secondNumber;
//                System.out.println("결과: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두 번째 정수)가 0일 수 없습니다.");
                }
                result = firstNumber / secondNumber;
//                System.out.println("결과: " + (firstNumber / secondNumber));
                break;
            default:
                throw new IllegalArgumentException("나눗셈 연산에서 분모(두 번째 정수)가 0일 수 없습니다.");
        }
        addResult(result);
        return result;
    }

    public List<Double> getResultList() {  // List 클래스 가져오기
        return resultList; // 필드 생성
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public void removeResult() {
        resultList.remove(0);
    }


}
