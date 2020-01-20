package ch1.ex2.question;

import java.util.Scanner;

public class TriangleMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하시는 크기의 정수를 입력해주세요 : "); int input = scanner.nextInt();

        triangleLB(input); // 왼쪽 아래
        triangleLU(input);
        triangleRB(input);
        triangleRU(input);
    }

    // 왼쪽 아래
    public static void triangleLB(int input){
        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위
    public static void triangleLU(int input){
        for(int i = input; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 아래
    public static void triangleRB(int input){
        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위
    public static void triangleRU(int input){
        for(int i = input; i > 0; i--){
            for(int j = input; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
