package ch6.ex8;

import java.util.Scanner;

public class HeapSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int x[] = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        heapSort(x, input);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void heapSort(int x[], int input){
        for(int i = (input - 1) / 2; i >= 0; i--){
            downHeap(x, i, input - 1);
        }

        for(int i = input - 1; i > 0; i--){
            swap(x, 0, i);
            downHeap(x, 0, i - 1);
        }
    }

    public static void downHeap(int x[], int left, int right){
        int temp = x[left];
        int child;
        int parent;

        for(parent = left; parent < (right + 1) / 2; parent = child){
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && x[cr] > x[cl]) ? cr : cl;

            if(temp >= x[child]) break;
            else x[parent] = x[child];
        }
        x[parent] = temp;
    }

    public static void swap(int x[], int idx1, int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
