package ch2.question;

import java.util.Scanner;

public class ArraySumQuestion {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[];

        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        arr = new int[input];

        setArr(arr);
        System.out.println("배열 안의 모든 합계는 = " + sumOf(arr));
    }

    // 배열 값 설정
    public static void setArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] 입력해주세요 : "); arr[i] = scanner.nextInt();
        }
    }

    public static int sumOf(int[] arr){
        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
