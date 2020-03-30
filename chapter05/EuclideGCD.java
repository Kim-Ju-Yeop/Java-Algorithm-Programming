package ch5.example.ex2;

import java.util.Scanner;

public class EuclidGCD_Answer {

    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("첫 번째 정수를 입력해주세요 : "); int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : "); int b = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(a, b) + "입니다.");
    }
}
