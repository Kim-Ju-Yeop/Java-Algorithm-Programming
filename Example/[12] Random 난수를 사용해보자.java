package ch2.example;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람의 수를 입력해주세요 : "); int input = scanner.nextInt();

        int height[] = new int[input];

        for(int i = 0; i < height.length; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] = " + height[i]);
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
