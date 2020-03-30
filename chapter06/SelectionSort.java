package ch6.ex2;

import java.util.Scanner;

// 단순 선택 정렬
public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }
        selectionSort(x, input);

        System.out.println("단순 선택 정렬을 진행하였습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void selectionSort(int[] x, int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(x[j] < x[min]) min = j;
            }
            swap(x, i, min);
        }
    }

    public static void swap(int[] x, int idx1, int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
