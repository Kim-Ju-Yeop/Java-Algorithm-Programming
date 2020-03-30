package ch3.example;

import java.util.Scanner;

public class SeqSearchSen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수를 입력해주세요 : "); int num = scanner.nextInt();
        int arr[] = new int[num + 1];

        for(int i = 0; i < num; i++){
            System.out.println("배열 x[" + i + "] : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("검색할 값을 입력해주세요 : "); int ky = scanner.nextInt();
        int idx = seqSearchSen(arr, num, ky);

        if(idx == -1) System.out.println("배열에서 검색하신 값은 존재하지 않습니다.");
        else System.out.println(ky + "은(는) 배열 x[" + idx + "]에 존재합니다.");
    }

    public static int seqSearchSen(int arr[], int num, int key){
        int i = 0;
        arr[num] = key;

        while(true){
            if(arr[i] == key) break;
            i++;
        }
        return i == num ? -1 : i;
    }
}
