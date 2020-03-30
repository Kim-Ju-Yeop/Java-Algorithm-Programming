package ch2.example;

import java.util.Scanner;

public class ReverseArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[];

        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        arr = new int[input];

        setArr(arr);
        changeOrder(arr);
        showArray(arr);
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
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    // 요소 값 출력
    public static void showArray(int arr[]){
        System.out.println("\n요소를 역순으로 정렬했습니다.\n");
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
