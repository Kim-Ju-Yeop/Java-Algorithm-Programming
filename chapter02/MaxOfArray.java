package ch2.example;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수를 입력해주세요 : "); int input = scanner.nextInt();

        int height[] = new int[input];

        for(int i = 0; i < height.length; i++){
            System.out.print("height[" + i +"] 번째 값을 입력해주세요 : "); height[i] = scanner.nextInt();
        }

        System.out.println("최댓값은 : " + findMax(height) + "입니다.");
    }

    public static int findMax(int height[]){
        int max = height[0];

        for(int i = 1; i < height.length; i++){
            if(height[i] > max) max = height[i];
        }
        return max;
    }
}
