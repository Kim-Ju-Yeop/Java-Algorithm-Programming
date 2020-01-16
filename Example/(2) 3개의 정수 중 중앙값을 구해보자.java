package ex1.example;

import java.util.Scanner;

public class Median_Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");

        System.out.print("A의 값을 입력해주세요 : "); int a = scanner.nextInt();
        System.out.print("B의 값을 입력해주세요 : "); int b = scanner.nextInt();
        System.out.print("C의 값을 입력해주세요 : "); int c = scanner.nextInt();

        int mid = findMid(a, b ,c);
        System.out.println("중앙값 : " + mid + "입니다.");
    }

    public static int findMid(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        } else if(a > c){
            return a;
        } else if(b > c){
            return c;
        } else{
            return b;
        }
    }
}
