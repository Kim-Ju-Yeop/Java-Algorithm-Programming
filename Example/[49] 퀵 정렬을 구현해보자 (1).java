package ch6.ex5;

import java.util.Scanner;

public class Partition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int[] x = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }

        partition(x, input);
    }

    public static void partition(int x[], int input){
        int pl = 0;
        int pr = input - 1;
        int pivot = x[input / 2];

        do{
            while(x[pl] < pivot) pl++;
            while(x[pr] > pivot) pr--;
            if(pl <= pr) swap(x, pl++, pr--);
        }while(pl <= pr);

        System.out.println("피벗의 값은 " + pivot + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for(int i = 0; i <= pl - 1; i++){
            System.out.println(x[i] + " ");
        }System.out.println();

        if(pl > pr + 1){
            System.out.println("피벗과 일치하는 그룹");
            for(int i = pr + 1; i <= pl - 1; i++){
                System.out.println(x[i] + " ");
            }System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for(int i = pr + 1; i < input; i++){
            System.out.println(x[i] + " ");
        }System.out.println();
    }

    public static void swap(int[] x, int idx1, int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }
}
