package ch1.ex2.example;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다.");
        System.out.print("n의 값을 입력해주세요 : "); int input = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= input; i++){
            sum += i;
        }
        System.out.println("1부터 " + input + "까지의 값의 합은 : " + sum + "입니다.");
    }
}
