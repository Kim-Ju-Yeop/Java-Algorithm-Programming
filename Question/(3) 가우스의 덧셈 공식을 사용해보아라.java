package ch1.ex2.question;

import java.util.Scanner;

public class SumOfGouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 값을 모두 더합니다.");
        System.out.print("n의 값을 입력해주세요 : "); int input = scanner.nextInt();

        int sum = makeSum(input);
        System.out.println("1부터 " + input + "까지의 값의 합은 : " + sum + "입니다.");
    }

    public static int makeSum(int input){
        int sum = ((1 + input) * input) / 2;
        return sum;
    }
}
