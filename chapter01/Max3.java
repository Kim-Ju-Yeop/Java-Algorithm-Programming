package ex1.example;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 개의 정수의 최대값을 구합니다.");

        System.out.print("A의 값을 입력해주세요 : "); int a = scanner.nextInt();
        System.out.print("B의 값을 입력해주세요 : "); int b = scanner.nextInt();
        System.out.print("C의 값을 입력해주세요 : "); int c = scanner.nextInt();

        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 : " + max + "입니다.");
    }
}
