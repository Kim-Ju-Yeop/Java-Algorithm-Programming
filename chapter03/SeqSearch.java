package ch3.example;

import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수를 입력해주세요 : "); int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("arr[" + i + "] : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("검색할 값을 입력해주세요 : "); int ky = scanner.nextInt();
        int idx = seqSearch(arr, num, ky);

        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(ky + "은(는) arr[" + idx + "]에 있습니다.");
    }

    public static int seqSearch(int[] arr, int num, int ky){
        int i = 0;

        while(true){
            if(i == num) return -1;
            if(arr[i] == ky) return i;
            i++;
        }
    }
}
