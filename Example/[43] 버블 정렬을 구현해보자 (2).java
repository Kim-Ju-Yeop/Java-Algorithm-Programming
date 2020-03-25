package ch6;

import java.util.Scanner;

// 버블 정렬(버전 2)
public class BubbleSort2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }
        bubbleSort(x, input);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void bubbleSort(int[] x, int input){
        for(int i = 0; i < input - 1; i++){
            int exchg = 0;
            for(int j = input - 1; j > i; j--){
                if(x[j - 1] > j){
                    swap(x, j -1, j);
                    exchg++;
                }
            }
            if(exchg == 0) break;
        }
    }

    public static void swap(int[] x, int idx1, int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
