package ch6.ex5;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }

        quickSort(x, 0, input - 1);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void quickSort(int x[], int left, int right){
        int pl = left;
        int pr = right;
        int pivot = x[(pl + pr) / 2];

        do{
            while(x[pl] < pivot) pl++;
            while(x[pr] > pivot) pr--;
            if(pl <= pr) swap(x, pl++, pr--);
        }while(pl <= pr);

        if(left < pr) quickSort(x, left, pr);
        if(pl < right) quickSort(x, pl, right);
    }

    public static void swap(int[] x, int idx1, int idx2) {
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
