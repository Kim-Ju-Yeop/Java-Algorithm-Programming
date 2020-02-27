package ch5.question;

import java.util.Scanner;

public class Q1_170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();

        int sum = 1;
        for(int i = input; i > 0; i--) sum *= i;
        System.out.println(input + "팩토리얼은 " + sum + "입니다.");
    }
}
