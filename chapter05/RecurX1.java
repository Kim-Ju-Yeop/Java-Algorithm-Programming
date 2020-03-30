package ch5.ex2;

import java.util.Scanner;

public class RecurX1 {

    public static void recur(int x){
        while(x > 0){
            recur(x - 1);
            System.out.println(x);
            x -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();

        recur(input);
    }
}
