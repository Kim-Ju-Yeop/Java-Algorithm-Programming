package ch5.example.ex1;

import java.util.Scanner;

public class Hanoi {

    // input 개의 원반을 x 번에서 y 번으로 이동시킵니다.
    public static void move(int input, int x, int y){
        if(input > 1) move(input - 1, x, 6 - x - y);
        System.out.println("원반[" + input + "]를 " + x + "기둥에서 " + y + "기둥으로 옮겼습니다.");
        if(input > 1) move(input - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("하노이의 탑");
        System.out.print("원반 개수를 입력해주세요 : "); int input = scanner.nextInt();

        move(input, 1, 3); // 1번 기둥의 n개의 원반을 3번 기둥으로 옮김니다.
    }
}
