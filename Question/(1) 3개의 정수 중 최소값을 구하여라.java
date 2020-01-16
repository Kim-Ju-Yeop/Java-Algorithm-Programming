package ex1.question;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3개의 정수 값의 최소값을 구합니다.");

        System.out.print("A값을 입력해주세요 : "); int a = scanner.nextInt();
        System.out.print("B값을 입력해주세요 : "); int b = scanner.nextInt();
        System.out.print("C값을 입력해주세요 : "); int c = scanner.nextInt();

        int max = findMax(a, b, c);
        System.out.println("최소값 : " + max + "입니다.");
    }

    public static int findMax(int a, int b, int c){
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }
}
