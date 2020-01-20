package ch1.ex2.question;

import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n 부터 n1 까지의 값을 더합니다.");
        System.out.print("n과 n1의 값을 입력해주세요 : "); int n = scanner.nextInt(); int n1= scanner.nextInt();

        int sum = makeSum(n, n1);
        System.out.println(n + "부터 " + n1 + "까지의 값의 합은 : " + sum + "입니다.");
    }

    public static int makeSum(int n, int n1){
        int small;
        int big;
        int sum = 0;

        if(n < n1){
            small = n;
            big = n1;
        } else{
            small = n1;
            big = n;
        }

        sum = ((small + big) * (big - --small)) / 2;
        return sum;
    }
}
