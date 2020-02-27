package ch5.question;

import java.util.Scanner;

public class Q2_170 {

    public static int gcd(int a, int b){
        int temp;
        int n;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }

        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수의 최대공약수를 구합니다.");
        System.out.print("첫 번째 정수를 입력해주세요 : "); int a = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : "); int b = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(a, b) + "입니다.");
    }
}
