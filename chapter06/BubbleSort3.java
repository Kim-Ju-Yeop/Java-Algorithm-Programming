package ch6;

import java.util.Scanner;

// 버블 정렬(버전 3)
public class BubbleSort3 {

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
        int k = 0;
        while(k < input - 1){
            int last = input - 1;
            for(int j = input - 1; j > k; j--){
                if(x[j - 1] > x[j]){
                    swap(x, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    public static void swap(int[] x, int idx1, int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
