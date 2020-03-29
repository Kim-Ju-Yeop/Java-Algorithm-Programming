package ch6.ex6;

import java.util.Scanner;

public class MergeSort {

    public static int[] buff;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("병합 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        mergeSort(x, input);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void mergeSort(int[] x, int input){
        buff = new int[input];

        __mergeSort(x, 0, input -1);

        buff = null;
    }

    public static void __mergeSort(int[] x, int left, int right){
        if(left < right){
            int i;
            int center = (left + right) / 2;
            int p = 0, j = 0, k = left;

            __mergeSort(x, left, center);
            __mergeSort(x, center + 1, right);

            for(i = left; i <= center; i++){
                buff[p++] = x[i];
            }

            while(i <= right && j < p){
                x[k++] = (buff[j] < x[i]) ? buff[j++] : x[i++];
            }

            while(j < p){
                x[k++] = buff[j++];
            }
        }
    }
}
