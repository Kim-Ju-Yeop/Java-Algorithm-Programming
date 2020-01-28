package ch2.question;

import java.util.Scanner;

public class ReverseArrayQuestion {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[];

        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        arr = new int[input];

        setArr(arr);
        showArray(arr);
        System.out.println();
        changeOrder(arr);
    }

    // 배열 값 설정
    public static void setArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] 입력해주세요 : "); arr[i] = scanner.nextInt();
        }
    }

    // 요소 값 변경
    public static void changeOrder(int arr[]){
        for(int i = 0; i < arr.length / 2; i++){
            System.out.println("arr[" + i + "] 과 a[" + (arr.length - i -1) + "] 를 교환합니다.");
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

            showArray(arr);
            System.out.println();
        }
    }

    // 요소 값 출력
    public static void showArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
