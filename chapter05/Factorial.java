package ch5.example.ex1;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int input){
        if(input > 0) return input * factorial(input - 1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();
        System.out.println(input + "의 펙토리얼은 " + factorial(input) + "입니다.");
    }
}
