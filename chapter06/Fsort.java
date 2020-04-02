package ch6.ex9;

import java.util.Scanner;

public class Fsort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("도수 정렬");
        System.out.print("요솟수 : "); int input = scanner.nextInt();
        int x[] = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        int max = x[0];
        for(int i = 1; i < input; i++){
            if(x[i] > max) max = x[i];
        }

        fSort(x, input, max);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i = 0; i < input; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static void fSort(int x[], int input, int max){
        int[] f = new int[max + 1];
        int[] b = new int[input];

        for(int i = 0; i < input; i++) f[x[i]]++; // 1단계
        for(int i = 1; i <= max; i++) f[i] += f[i - 1]; // 2단계
        for(int i = input - 1; i >= 0; i--) b[--f[x[i]]] = x[i]; // 3단계
        for(int i = 0; i < input; i++) x[i] = b[i]; // 4단계
    }
}
