package ch1.ex2.question;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하시는 정사각형의 크기를 입력하세요 : "); int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input; j++){
                System.out.printf("%3c", '*');
            }
            System.out.println();
        }
    }
}
