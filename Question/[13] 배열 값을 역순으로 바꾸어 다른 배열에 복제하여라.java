package ch2.question;

import java.util.Scanner;

public class ReverseQuestion {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b[];

        System.out.print("요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        b = new int[input];

        setArr(b);
        changeOrder(b);
        int a[] = b.clone();
        showArray(a);
    }

    // 배열 값 설정
    public static void setArr(int b[]){
        for(int i = 0; i < b.length; i++){
            System.out.print("b[" + i + "] 입력해주세요 : "); b[i] = scanner.nextInt();
        }
    }

    // 요소 값 변경
    public static void changeOrder(int b[]){
        for(int i = 0; i < b.length / 2; i++){
            int temp = b[i];
            b[i] = b[b.length - i - 1];
            b[b.length - i - 1] = temp;
        }
    }

    // 요소 값 출력
    public static void showArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }
}
