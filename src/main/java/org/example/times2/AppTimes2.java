package org.example.times2;

import java.util.Scanner;

public class AppTimes2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        /// 양의 정수 입력 받기
        while(true){
            System.out.println("첫 번째 숫자를 입력하세요.");
            int firstNumber = sc2.nextInt();
            if(firstNumber < 0){
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }

            System.out.println("두 번재 숫자를 입력하세요.");
            int secondNumber = sc2.nextInt();
            if(secondNumber < 0){
                System.out.println("음수는 입력할 수 없습니다. 프로그램을 재시작합니다.");
                continue;
            }




        }
    }
}
