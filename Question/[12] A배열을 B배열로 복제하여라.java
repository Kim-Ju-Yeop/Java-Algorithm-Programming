package ch2.question;

import java.util.Scanner;

public class CopyArray {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("배열 a의 요솟수를 입력해주세요 : "); int input = scanner.nextInt();
        int a[] = new int[input];
        int b[];

        setArray(a);

        b = a.clone();
        showArray(a, b);
    }

    public static void setArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print("array[" + i + "] 입력해주세요 : "); array[i] = scanner.nextInt();
        }
    }

    public static void showArray(int a[], int b[]){
        System.out.print("a 배열의 값 : ");
        for(int i : a){
            System.out.print(i + " ");
        }

        System.out.print("b 배열의 값 : ");
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
