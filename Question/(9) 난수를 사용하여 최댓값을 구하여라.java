package ch2.question;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandQuestion {
    public static void main(String[] args) {
        Random rand = new Random(80);
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");

        int input = rand.nextInt(90);
        System.out.println("사람 수는 " + input + "명입니다.");

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
