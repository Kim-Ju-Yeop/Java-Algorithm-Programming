package ch1.ex2.example;

import java.util.Scanner;

public class Digits_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        do{
            System.out.print("정수를 입력하여주세요 : ");
            input = scanner.nextInt();
        } while(input < 10 || input > 99);
        System.out.println("입력하신 정수의 값은 : "+ input + "입니다.");
    }
}
