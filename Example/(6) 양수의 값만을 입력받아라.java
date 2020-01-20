package ch1.ex2.example;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다.");

        int input = 0;

        do{
            System.out.print("n의 값을 입력해주세요 : "); input = scanner.nextInt();
        }while(input <= 0);

        int sum = makeSum(input);
        System.out.println("1부터 " + input + "까지의 값의 합은 : " + sum + "입니다.");
    }

    public static int makeSum(int input){
        int sum = 0;

        for(int i = 1; i <= input; i++){
            sum += i;
        }
        return sum;
    }
}
