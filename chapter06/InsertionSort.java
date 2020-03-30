package ch6.ex3;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, input);

        System.out.println("단순 삽입 정렬을 진행하였습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void insertionSort(int x[], int input){
        for(int i = 1; i < input; i++){
            int j;
            int tmp = x[i];
            for(j = i; j > 0 && x[j - 1] > tmp; j--){
                x[j] = x[j - 1];
            }
            x[j] = tmp;
        }
    }
}
