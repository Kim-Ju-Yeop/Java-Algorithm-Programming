package ex1.example;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요 : "); int input = scanner.nextInt();

        if(input > 0){
            System.out.println("이 정수는 양수입니다.");
        } else if(input < 0){
            System.out.println("이 정수는 음수입니다.");
        } else{
            System.out.println("이 정수는 0입니다.");
        }
    }
}
