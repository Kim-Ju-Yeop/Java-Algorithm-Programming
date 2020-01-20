package ch1.ex2.question;

import java.util.Scanner;

public class SumDesign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n 까지의 정수를 더합니다.");
        System.out.print("n의 값을 입력해주세요 : "); int input = scanner.nextInt();

        printSum(input);
    }

    public static void printSum(int input){
        int sum = 0;

        for(int i = 1; i <= input; i++){
            if(i == 1){
                System.out.print(i);
            } else{
                System.out.print(" + " + i);
            }
            sum += i;
        }
        System.out.print(" = " + sum);
    }
}
